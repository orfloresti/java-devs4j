/**
 * 
 */
package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author orlando_floresti
 *
 */

@RestController
@RequestMapping("/")
public class HelloWorldController {
	
	@GetMapping
	public ResponseEntity<String> helloworld() {
		return new ResponseEntity<>("<h1>Hello word</h1>", HttpStatus.OK);
	}
}
