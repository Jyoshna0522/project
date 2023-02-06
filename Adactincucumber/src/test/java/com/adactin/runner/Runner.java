package com.adactin.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\selenium\\Adactincucumber\\src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
glue = "com.adactin.stepdefinition")

public class Runner {
public static void main(String[] args) {
	System.out.println("browser launch");
}
}
