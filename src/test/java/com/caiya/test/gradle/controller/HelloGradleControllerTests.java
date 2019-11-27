package com.caiya.test.gradle.controller;

import com.caiya.test.gradle.BaseTest;
import org.junit.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * HelloGradleControllerTests.
 *
 * @author wangnan
 * @since 1.0.0, 2019/11/27
 **/
public class HelloGradleControllerTests extends BaseTest {


    @Test
    public void testHelloGradle() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello Gradle!"));
    }


}
