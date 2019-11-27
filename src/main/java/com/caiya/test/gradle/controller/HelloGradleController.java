package com.caiya.test.gradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloGradleController.
 *
 * @author wangnan
 * @since 1.0.0, 2019/11/27
 **/
@RestController
public class HelloGradleController {

    @GetMapping
    public String helloGradle() {
        return "Hello Gradle!";
    }

}
