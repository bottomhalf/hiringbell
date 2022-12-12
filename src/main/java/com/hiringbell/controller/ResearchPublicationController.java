package com.hiringbell.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiringbell.entity.ResearchPublication;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.ResearchPublicationService;

@RestController
@RequestMapping("/ResearchPublication")
public class ResearchPublicationController extends BaseController {
	
	@Autowired
	ResearchPublicationService researchPublicationService;
	
	@PostMapping("/addResearchPublication")
	public ResponseModal addResearchPublication(@RequestBody ResearchPublication researchPublication) {
		var result = this.researchPublicationService.addResearchPublicationService(researchPublication);
		return BuildOk(result);
	}
	
	@PutMapping("/updateResearchPublication/{researchPublicationId}")
	public ResponseModal updateResearchPublication(@RequestBody ResearchPublication researchPublication, @PathVariable("researchPublicationId") long researchPublicationId) throws IOException {
		var result = this.researchPublicationService.updateResearchPublicationService(researchPublication, researchPublicationId);
		return BuildOk(result);
	}
	
	@GetMapping("/getAllResearchPublication")
	public ResponseModal getAllResearchPublication() {
		var result = this.researchPublicationService.getAllResearchPublicationService();
		return BuildOk(result);
	}
	
	@GetMapping("/getResearchPublicationByUserId/{userId}")
	public ResponseModal getResearchPublicationByUserId(@PathVariable("userId") long userId) {
		var result = this.researchPublicationService.getResearchPublicationByUserIdService(userId);
		return BuildOk(result);
	}
	
	@DeleteMapping("/deleteResearchPublicationByresearchPublicationId/{researchPublicationId}")
	public ResponseModal deleteResearchPublicationByresearchPublicationId(@PathVariable("researchPublicationId") long researchPublicationId) {
		var result = this.researchPublicationService.deleteResearchPublicationByresearchPublicationIdService(researchPublicationId);
		return BuildOk(result);
	}
	
}
