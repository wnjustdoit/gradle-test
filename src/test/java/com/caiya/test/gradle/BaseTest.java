package com.caiya.test.gradle;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * BaseTest.
 *
 * @author wangnan
 * @since 1.0.0, 2019/11/27
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@AutoConfigureMockMvc
public abstract class BaseTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected MockMvc mockMvc;



}
