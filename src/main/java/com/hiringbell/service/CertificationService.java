package com.hiringbell.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.Certification;
import com.hiringbell.repository.CertificationRepository;

@Service
public class CertificationService {
	
	@Autowired
	CertificationRepository certificationRepository;

	public String addCertificationService(Certification certification) {
		this.certificationRepository.addCertificationRepository(certification);
		return null;
		
	}

	

}
