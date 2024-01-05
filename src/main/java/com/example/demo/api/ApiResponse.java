package com.example.demo.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class ApiResponse<T> {

	private final T response;
	
	public ApiResponse(T resp) {
		this.response = resp;
	}

	public T getResponse() {
		return response;
	}

}
