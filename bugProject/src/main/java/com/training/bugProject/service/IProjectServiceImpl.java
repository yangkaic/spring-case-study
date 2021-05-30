package com.training.bugProject.service;

import com.training.bugProject.entity.Project;
import com.training.bugProject.repository.IProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IProjectServiceImpl implements IProjectService {

    @Autowired
    IProjectRepository projectRepository;

    @Override
    public Long createProject(Project project) {
        Project project2 = projectRepository.save(project);
        return project2.getId();
    }


}
