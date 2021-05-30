package com.training.bugProject.repository;

import com.training.bugProject.entity.BugRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BugRepository extends JpaRepository<BugRequest, Long> {
}
