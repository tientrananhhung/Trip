package edu.poly.valaditor;

import edu.poly.entity.Users;
import edu.poly.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


/**
 * @author imssbora
 */
@Component
public class UserValidator implements Validator {

    @Autowired
    UserImpl user;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(Users.class);
    }

    @Override
    public void validate(Object obj, Errors err) {
        Users users = (Users) obj;
        if(users.getId() == 0){
            if(user.existsByEmail(users.getEmail())){
                err.rejectValue("email", "users.email.invalid");
            }
            if(user.existsByPhone(users.getPhone())){
                err.rejectValue("phone", "users.phone.invalid");
            }
            if(!users.getPhone().matches("(\\+)?\\d{10,11}")){
                err.rejectValue("phone", "users.phone.typemismatch");
            }
            if(user.existsByUsername(users.getUsername())){
                err.rejectValue("username", "users.username.invalid");
            }
            if(!users.getUsername().matches("^[a-z0-9_-]{6,20}$")){
                err.rejectValue("username", "users.username.typemismatch");
            }
        } else {
            Users us = user.getById(users.getId());
            if (!users.getEmail().equals(us.getEmail())) {
                if (user.existsByEmail(users.getEmail())) {
                    err.rejectValue("email", "users.email.invalid");
                }
            }
            if (!users.getPhone().equals(us.getPhone())) {
                if (user.existsByPhone(users.getPhone())) {
                    err.rejectValue("phone", "users.phone.invalid");
                }
                if (!users.getPhone().matches("(\\+)?\\d{10,11}")) {
                    err.rejectValue("phone", "users.phone.typemismatch");
                }
            }
        }

    }

}
