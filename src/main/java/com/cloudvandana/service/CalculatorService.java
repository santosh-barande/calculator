package com.cloudvandana.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public double calculate(double num1, double num2, String operator) {
		switch (operator) {
		case "add":
			return num1 + num2;
		case "subtract":
			return num1 - num2;
		case "multiply":
			return num1 * num2;
		case "divide":
			return num2 != 0 ? num1 / num2 : 0;
		default:
			throw new IllegalArgumentException("Invalid operator");
		}
	}
}