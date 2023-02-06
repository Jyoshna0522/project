package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\selenium\\New folder\\PRO\\src\\test\\java\\com\\feature\\cucu.feature",
glue = "com.stepdefinition")
public class Runner {

}
