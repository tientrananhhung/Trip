package edu.poly.controller;

import edu.poly.common.CheckSession;
import edu.poly.common.Constants;
import edu.poly.common.TimeUtils;
import edu.poly.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vhphat on 8/27/2016.
 */
@Controller
@RequestMapping(value = "/upload")
public class FileUploadController {
    private static final String IMG_ROOT_PATH = "E:\\file-upload\\";

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView home(Model model,HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session) && !CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        model.addAttribute("product", new Product());
        mav.setViewName("upload");
        return mav;
    }

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public ModelAndView uploadFileHandler(ModelAndView mav, HttpServletRequest request, @ModelAttribute("product") Product product, HttpSession session) {
        try {
            if (!CheckSession.admin(session) && !CheckSession.partner(session)) {
                mav.setViewName("redirect:/" + Constants.Characters.BLANK);
                return mav;
            }
            CommonsMultipartFile[] files = product.getFileData();
            ArrayList<String> listImg = new ArrayList<>();
            for (int i = 0; i < files.length; i++) {
                CommonsMultipartFile file = files[i];
                if(file.isEmpty()){
                    mav.setViewName("redirect:/upload");
                    return mav;
                }
                byte[] bytes = file.getBytes();
                // Creating the directory to store file
                // Assume uploaded file location on web server is D:\file-upload
                String appPath = request.getServletContext().getRealPath("");
                appPath = appPath.replace('\\', '/');
                File dir = new File(appPath);
                if (!dir.exists()) {
                    dir.mkdirs();
                }

                // Create the file on server
                String name = TimeUtils.getCurrentTime().getTime() + "_" + file.getOriginalFilename();
                String fileSource = dir.getAbsolutePath() + File.separator + "resources" + File.separator + "images" + File.separator + name;
                listImg.add(name);
                File serverFile = new File(fileSource);
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();
            }
            session.setAttribute("listImg", listImg);
            mav.setViewName("redirect:/upload");
            return mav;
        } catch (Exception e) {
            e.printStackTrace();
            return mav;
        }
    }

    @RequestMapping(value = "/photos", method = RequestMethod.GET)
    public ModelAndView show() {
        List<String> imgList = new ArrayList<>();
        ModelAndView mav = new ModelAndView();
        File dir = new File(IMG_ROOT_PATH);
        for (File file : dir.listFiles()) {
            imgList.add("/image/" + file.getName());
        }
        mav.setViewName("photo");
        return mav;
    }


    @RequestMapping(value = "/image/{imageName}")
    @ResponseBody
    public byte[] getImage(@PathVariable(value = "imageName") String imageName) throws IOException {
        File serverFile = new File(IMG_ROOT_PATH + imageName + ".jpg");

        return Files.readAllBytes(serverFile.toPath());
    }
}
