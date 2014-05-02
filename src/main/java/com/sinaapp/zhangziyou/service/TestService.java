package com.sinaapp.zhangziyou.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service  
public class TestService {  
   @Async
    public void update() {  
        try {  
            Thread.sleep(2000);  
            // do something  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
        System.out.println("operation complete.");  
    }  
}  
