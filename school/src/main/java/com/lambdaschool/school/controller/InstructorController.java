package com.lambdaschool.school.controller;

import com.lambdaschool.school.service.InstructorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/instructors")
public class InstructorController {
	@Autowired
	private InstructorService instructorService;

	private static final Logger logger = LoggerFactory.getLogger(InstructorController.class);

	@GetMapping(value = "/instructors", produces = {"application/json"})
	public ResponseEntity<?> getInstructors(){
		logger.info("GET /instructors/instructors");
		return new ResponseEntity<>(instructorService.findAll(), HttpStatus.OK);
	}
}
