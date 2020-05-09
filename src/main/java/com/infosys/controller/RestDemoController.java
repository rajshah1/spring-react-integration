package com.infosys.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.model.*;
import com.infosys.service.FirebaseService;;

@RestController
public class RestDemoController {
	@Autowired
	FirebaseService firebaseService;
	@GetMapping("/getUserDetails/{Uname}")
	public Person getExample(@PathVariable("Uname") String name) throws InterruptedException, ExecutionException {
		return firebaseService.getUserDetails(name);
	}

	@PostMapping("/createUser")
	public String postExample(@RequestBody Person person) throws InterruptedException, ExecutionException {
		return firebaseService.saveUserDetails(person);
	}

	@PutMapping("/updateUser")
	public String putExample(@RequestBody Person person) throws InterruptedException, ExecutionException {
		return "Updated User" + person.getName();
	}

	@DeleteMapping("/deleteUser")
	public String deleteExample(@RequestHeader String name) {
		return "Deleted User " + name;
	}

}
