package com.ssn.service;

import org.springframework.stereotype.Service;

import com.ssn.modal.Citizen;

@Service
public class CitizenServiceImpl implements CitizenService {

	public Citizen getCitizenState(Citizen citizen) {
		
		String ssn = citizen.getSsn();
		
		if (ssn.length() > 0) {
			char ssnId = ssn.charAt(0);
			System.out.println("SSN-ID :: " + ssnId);
			String stateName = "";
			
			switch (ssnId) {
				case '1':
					stateName = "New Jersey";
					break;
				case '2':
					stateName = "Ohio";
					break;
				case '3':
					stateName = "Texas";
					break;
				case '4':
					stateName = "California";
					break;
				case '5':
					stateName = "Rhode Island";
					break;
				case '6':
					stateName = "Kentucky";
					break;
				default:
					return null;
			}
			citizen.setState(stateName);			
		}
		return citizen;
	}

}
