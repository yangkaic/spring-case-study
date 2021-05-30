package com.training.bugProject.client;

import com.training.bugProject.entity.BugRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="email-service")
public interface EmailClient {

    @PostMapping("/email")
    void sendEmail(BugRequest bugRequest);

}
