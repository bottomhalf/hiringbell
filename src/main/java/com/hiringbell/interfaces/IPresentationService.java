package com.hiringbell.interfaces;

import java.io.IOException;
import java.util.ArrayList;

import com.hiringbell.entity.Presentation;

public interface IPresentationService {
	
	String addPresentationService(Presentation presentation);
	String updatePresentationService(Presentation presentation, long presentationId) throws IOException;
	ArrayList<Presentation> getAllPresentationService();
	ArrayList<Presentation> getPresentationByUserIdService(long userId);
	String deletePresentationByPresentationIdService(long presentationId);

}
