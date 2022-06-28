package com.hiringbell.controller;

import org.springframework.http.HttpStatus;

import com.hiringbell.model.ResponseModal;

public class BaseController {
	
	public static ResponseModal BuildOk(Object data) {
		ResponseModal modal = new ResponseModal();
		modal.setResponseBody(data);
		modal.setHttpStatusCode(HttpStatus.OK);
		return modal;
	}
}
