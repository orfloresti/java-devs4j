package com.example.di.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Squire implements Figure {
	//@Value("2.5")
	@Value("${square.side}")
	private double size;
	
	@Override
	public double calculateArea() {
		return size*size;
	}

}
