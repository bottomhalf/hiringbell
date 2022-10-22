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

import com.hiringbell.entity.Presentation;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.PresentationService;

@RestController
@RequestMapping("/Presentation")
public class PresentationController extends BaseController {
	
	@Autowired
	PresentationService presentationService;
	
	@PostMapping("/addPresentation")
	public ResponseModal addPresentation(@RequestBody Presentation presentation) {
		var result = this.presentationService.addPresentationService(presentation);
		return BuildOk(result);
	}
	
	@PutMapping("/updatePresentation/{presentationId}")
	public ResponseModal updatePresentation (@RequestBody Presentation presentation, @PathVariable("presentationId") long presentationId) throws IOException{
		var result = this.presentationService.updatePresentationService(presentation, presentationId);
		return BuildOk(result);
	}
	
	@GetMapping("/getAllPresentation")
	public ResponseModal getAllPresentation() {
		var result = this.presentationService.getAllPresentationService();
		return BuildOk(result);
	}
	
	@GetMapping("/getPresentationByUserId/{userId}")
	public ResponseModal getPresentationByUserId (@PathVariable("userId") long userId) {
		var result = this.presentationService.getPresentationByUserIdService(userId);
		return BuildOk(result);
	}
	
	@DeleteMapping("/deletePresentationByPresentationId/{presentationId}")
	public ResponseModal deletePresentationByPresentationId(@PathVariable("presentationId") long presentationId) {
		var result = this.presentationService.deletePresentationByPresentationIdService(presentationId);
		return BuildOk(result);
	}
	

}
