package edu.poly.controller;

import edu.poly.entity.Posts;
import edu.poly.entity.Users;
import edu.poly.impl.PostImpl;
import edu.poly.impl.UserImpl;
import edu.poly.model.PostsDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserImpl user;

    @Autowired
    PostImpl post;

    @GetMapping(path = "/abcd", produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Posts>> abc() {
        try {
            List<Posts> list = (List<Posts>) post.findAll();
            ResponseEntity<List<Posts>> responseEntity = new ResponseEntity<List<Posts>>(list, HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return new ResponseEntity<List<Posts>>(HttpStatus.BAD_REQUEST);
        }
    }
}
