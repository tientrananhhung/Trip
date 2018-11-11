package edu.poly.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;


public class mailTest {

   public static boolean mailSend(String to,String body,String subject) {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
       JavaMailSenderImpl mailSender = (JavaMailSenderImpl) context.getBean("mailSender");
       MimeMessage mimeMessage = mailSender.createMimeMessage();
       MimeMessageHelper helper;
       {
           try {
               helper = new MimeMessageHelper(mimeMessage, false, "utf-8");
               mimeMessage.setContent(body,"text/html; charset=utf-8");
               helper.setTo(to);
               helper.setSubject(subject);
               helper.setFrom("kuminhdey20@gmail.com", "Smart Trip");
               mailSender.send(mimeMessage);
           } catch (MessagingException e) {
               e.printStackTrace();
               return false;
           } catch (UnsupportedEncodingException e) {
               e.printStackTrace();
               return false;
           }
       }
       return true;
   }
}
