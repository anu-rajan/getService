package com.example.getService.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "GetServiceController", description = "REST Apis to get greeting")
@RestController
public class GetServiceController {
	
	Logger logger = Logger.getLogger(GetServiceController.class.getName());

	@ApiOperation(value = "Get greeting", response = Iterable.class, tags = "getGreeting")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })

	@RequestMapping(value = "/greeting", method=RequestMethod.GET)
	public ResponseEntity<String> greeting() {
		logger.log(Level.INFO, "getService -- getGreeting");
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}

}
