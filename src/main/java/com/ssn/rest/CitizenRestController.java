package com.ssn.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssn.modal.Citizen;
import com.ssn.service.CitizenService;

@RestController
@RequestMapping("/ssn")
public class CitizenRestController {

	@Autowired
	private CitizenService citizenService;

	@PostMapping()
	public ResponseEntity<Object> getCitizenState(@RequestBody Citizen citizen) {
		System.out.println("Input :: " + citizen);
		Citizen citizenState = citizenService.getCitizenState(citizen);
		if (citizenState != null) {
			System.out.println("Output :: " + citizenState);
			return new ResponseEntity<>(citizenState, HttpStatus.FOUND);
		}
		System.out.println("Output :: " + citizenState);
		return new ResponseEntity<>("Invalid SSN", HttpStatus.NOT_FOUND);
	}

}
