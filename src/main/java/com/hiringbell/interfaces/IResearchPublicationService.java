package com.hiringbell.interfaces;

import java.io.IOException;
import java.util.ArrayList;

import com.hiringbell.entity.ResearchPublication;

public interface IResearchPublicationService {

	String addResearchPublicationService(ResearchPublication researchPublication);
	String updateResearchPublicationService(ResearchPublication researchPublication,long researchPublicationId) throws IOException;
	ArrayList<ResearchPublication> getAllResearchPublicationService();
	ArrayList<ResearchPublication> getResearchPublicationByUserIdService(long userId);
	String deleteResearchPublicationByresearchPublicationIdService(long researchPublicationId);
}
