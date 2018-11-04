//package edu.poly.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.commons.CommonsMultipartFile;
//
//import javax.servlet.http.HttpServletRequest;
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by vhphat on 8/27/2016.
// */
//@Controller
//@RequestMapping(value = "/upload")
//public class FileUploadController {
//    private static final String IMG_ROOT_PATH = "E:\\file-upload\\";
//
//    @RequestMapping(method = RequestMethod.GET)
//    public String home(Model model) {
//        model.addAttribute("product", new Product());
//        return "upload";
//    }
//
//    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
//    public String uploadFileHandler(HttpServletRequest request, @ModelAttribute("product") Product product) {
//        System.out.println(product.getName());
//        System.out.println(product.getPrice());
//        try {
////            CommonsMultipartFile[] files = product.getFileData();
////            for(int i = 0; i<files.length; i++) {
////                CommonsMultipartFile file = files[i];
////                byte[] bytes = file.getBytes();
////                // Creating the directory to store file
////                // Assume uploaded file location on web server is D:\file-upload
////                String appPath = request.getServletContext().getRealPath("");
////                appPath = appPath.replace('\\', '/');
////                File dir = new File(appPath);
////                if (!dir.exists()) {
////                    dir.mkdirs();
////                }
////
////                // Create the file on server
////                String fileSource = dir.getAbsolutePath() + File.separator +"resources"+ File.separator + "resources" +  File.separator + "minh" + i + "." + file.getOriginalFilename().split("\\.")[1];
////                System.out.println(fileSource);
////                File serverFile = new File(fileSource);
////                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
////                stream.write(bytes);
////                stream.close();
//            }
//
//            //return "You uploaded successfully a file, at : " + fileSource;
//            return "redirect:/upload/photos";
//        } catch (Exception e) {
//           e.printStackTrace();
//            return "Error when uploading file"+ e;
//        }
//    }
//
//    @RequestMapping(value = "/photos", method = RequestMethod.GET)
//    String show(Model model) {
//        List<String> imgList = new ArrayList<>();
//
//        File dir = new File(IMG_ROOT_PATH);
//        for (File file : dir.listFiles()) {
//            imgList.add("/image/" + file.getName());
//        }
//        model.addAttribute("imgPathList", imgList);
//        return "photo";
//    }
//
//
//    @RequestMapping(value = "/image/{imageName}")
//    @ResponseBody
//    public byte[] getImage(@PathVariable(value = "imageName") String imageName) throws IOException {
//        File serverFile = new File(IMG_ROOT_PATH + imageName + ".jpg");
//
//        return Files.readAllBytes(serverFile.toPath());
//    }
//}
