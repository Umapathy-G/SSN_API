package com.ssn.service;

import org.springframework.stereotype.Service;

import com.ssn.modal.Citizen;

@Service
public interface CitizenService {

	public Citizen getCitizenState(Citizen citizen);

}
