package com.cloudvandana.controller;

import com.cloudvandana.service.CalculatorService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculate")
public class CalculatorController {

	private final CalculatorService calculatorService;

	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@GetMapping
	public double calculate(@RequestParam double num1, @RequestParam double num2, @RequestParam String operator) {
		return calculatorService.calculate(num1, num2, operator);
	}
}