package com.training.bugProject.controller;

import com.training.bugProject.repository.BugRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

class BugControllerTest {
	@InjectMocks
	BugController bugController;
	@Mock
	BugRepository bugRepository;
	@Test
	public void testCreateBug(){
		
	}
}
