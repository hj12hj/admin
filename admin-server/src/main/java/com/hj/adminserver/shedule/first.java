package com.hj.adminserver.shedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class first {

    @Scheduled(fixedRate = 200)
    public void ddd()
    {
       log.info("------------------");
    }

}
