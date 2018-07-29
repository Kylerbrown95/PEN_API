package com.brown.kyle.api.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.brown.kyle.api.constants.ApiConstants;
import com.brown.kyle.api.pojo.Information;

@Service
public class ApiServiceImpl implements ApiService {
	
	@Value("${api.version}")
	private String version;
	
	public Information healthCheck() {
		
		Information info = new Information();
		info.setApiDate(Calendar.getInstance().getTime());
		info.setApiDescription(ApiConstants.DESCRIPTION);
		info.setApiName(ApiConstants.NAME);
		info.setApiStatus(true);
		info.setApiVersion(version);
		
		return info;
	}

}
