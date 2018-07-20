package com.brown.kyle.api.controller;

import java.io.File;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	/**
	 * This method essentially acts as a health check to ensure the api is alive.
	 * Hello world.
	 * 
	 * @return Information Object
	 */

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

	/**
	 * 
	 * This method will check whether the requests fields are valid, the user will
	 * be met with an error
	 * 
	 * @param file
	 * @return
	 * @return boolean
	 */

	@PostMapping
	public ResponseEntity<?> isInformationValid(@RequestBody File file) {

		boolean isValid = false;

		if (file.getAbsolutePath().endsWith("*.raml")) {
			isValid = true;
			return new ResponseEntity<>(isValid, HttpStatus.OK);
		}
		return new ResponseEntity<>(isValid, HttpStatus.BAD_REQUEST);

	}

}
