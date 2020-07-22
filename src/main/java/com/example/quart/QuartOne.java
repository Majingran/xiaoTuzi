package com.example.quart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;


@Component
@EnableScheduling
public class QuartOne {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void MySchedulMethod(){
        this.logger.info("定时任务已经触发！！！");
    }

}
