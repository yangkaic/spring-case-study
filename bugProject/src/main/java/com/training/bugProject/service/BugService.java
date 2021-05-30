package com.training.bugProject.service;


import com.training.bugProject.entity.BugRequest;

public interface BugService {

    void create(BugRequest bugRequest) throws Exception;
}
