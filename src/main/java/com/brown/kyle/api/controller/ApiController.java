package com.brown.kyle.api.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.brown.kyle.api.constants.ApiConstants;
import com.brown.kyle.api.pojo.Information;

/**
 * 
 * @author Kyle Brown
 *
 */
@RestController
@RequestMapping("/api")
public class ApiController {

	@Value("${api.version}")
	private String version;

	@GetMapping("/info")
	@ResponseBody
	public Information getApiInformation() {

		Information info = new Information();
		info.setApiDate(Calendar.getInstance().getTime());
		info.setApiDescription(ApiConstants.DESCRIPTION);
		info.setApiName(ApiConstants.NAME);
		info.setApiStatus(true);
		info.setApiVersion(version);

		return info;

	}

}
