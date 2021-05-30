package com.training.bugProject.repository;

import com.training.bugProject.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProjectRepository extends JpaRepository<Project, Long> {
}
