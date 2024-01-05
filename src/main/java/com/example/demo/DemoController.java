package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.ApiError;
import com.example.demo.api.ApiResponse;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@Value("${server.compression.enabled}")
	private boolean compressionEnabled;

	@RequestMapping(value = "/ok", produces = MediaType.APPLICATION_JSON_VALUE, method = {RequestMethod.POST, RequestMethod.GET})
	public ResponseEntity<ApiResponse<String>> ok() {
		ApiResponse<String> response = new ApiResponse<>("OK! - server.compression.enabled: " + compressionEnabled);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/ko", produces = MediaType.APPLICATION_JSON_VALUE, method = {RequestMethod.POST, RequestMethod.GET})
	public ResponseEntity<ApiError> ko() {
		ApiError response = new ApiError();
		response.setStatus(HttpStatus.BAD_REQUEST);
		response.setMessage("KO!!! - server.compression.enabled: " + compressionEnabled);
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}
}
