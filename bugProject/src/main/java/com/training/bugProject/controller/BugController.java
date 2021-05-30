package com.training.bugProject.controller;

import com.training.bugProject.entity.BugRequest;
import com.training.bugProject.service.BugService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@CrossOrigin
public class BugController {

    @Autowired
    BugService bugService;

    @RequestMapping(method = RequestMethod.GET, value = "/bug/{id}")
    public void getBug(@PathVariable Long id) {
        System.out.println("get bug called");
        System.out.println("bug id" + id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/bug")
    public void getAllBug() {
        System.out.println("get all bugs called");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/bug")
    @ApiOperation(consumes = "application/json", value = "create Bug")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Long createNewBug(@Valid @RequestBody BugRequest bugRequest) throws Exception{
        //response.addHeader("content-type", "application/json123");
        bugService.create(bugRequest);
        return bugRequest.getId();
    }

    @ExceptionHandler(Exception.class)
    public void handleException(){
        System.out.println("handled exception");
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/bug/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void updateBug(@RequestBody BugRequest bugRequest, @PathVariable Long id) {
        System.out.println("update bug called");
        System.out.println(bugRequest.toString());
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/bug/{id}")
    public void deleteBug(@PathVariable Long id) {
        System.out.println("update bug called");
    }
}
