/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service("myScheduleService")
public class MyScheduleServiceImple implements MyScheduleService{

    @Override
//    @Scheduled(cron="0/1 * * * * *")
    @Scheduled(cron="0 46/1 * * * ?")
//    @Scheduled(fixedDelay = 5000)
    public void testSchedule() {
        System.out.println("test");
    }
    
}
