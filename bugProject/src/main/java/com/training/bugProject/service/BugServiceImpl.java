package com.training.bugProject.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.training.bugProject.client.EmailClient;
import com.training.bugProject.entity.BugRequest;
import com.training.bugProject.repository.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BugServiceImpl implements  BugService {

    @Autowired
    BugRepository bugRepository;

    @Autowired
    EmailClient emailClient;

    @Transactional(rollbackOn = Exception.class, dontRollbackOn = {ArithmeticException.class,
            IllegalArgumentException.class})
    //@HystrixCommand(fallbackMethod = "fallback1")
    public void create(BugRequest bugRequest) throws Exception {
        System.out.println(bugRequest);
        //childMethod(bugRequest);
        bugRepository.save(bugRequest);
        //emailClient.sendEmail(bugRequest);
        //throw new Exception();
    }

    public String fallback1() {
        return "fallback1()...";
    }

//    @Transactional(value = Transactional.TxType.REQUIRES_NEW)
//    public void childMethod(BugRequest bugRequest) {
//        bugRepository.save(bugRequest);
//    }
}
