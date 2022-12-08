package com.hiringbell.interfaces;

import java.io.IOException;
import java.util.ArrayList;

import com.hiringbell.entity.Patent;

public interface IPatentService {
	
	public String addPatentService(Patent patent);
	public String updatePatentService(Patent patent, long patentId) throws IOException;
	public ArrayList<Patent> getAllPatentService();
	public ArrayList<Patent> getPatentByUserIdService(long userId);
	public String deletePatentByPatentIdService(long patentId);
	
	

}
