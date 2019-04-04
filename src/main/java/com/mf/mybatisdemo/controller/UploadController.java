package com.mf.mybatisdemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author mf
 * @since 2019-04-03 19:52
 */
@RestController
public class UploadController {

    @PostMapping(value = "/upload",headers = "content-type=multipart/form-data")
    public void upload(MultipartFile file) {
        System.out.println(file);

    }
}