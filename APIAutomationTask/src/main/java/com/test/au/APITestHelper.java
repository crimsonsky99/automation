package com.test.au;

import com.jayway.restassured.path.json.JsonPath;


public class APITestHelper {	
		
	public void validateResponseforPostCode(JsonPath jsonPathEvaluator,String response)
	{
	
		printConsole("Response Recieved from API -----> " + response);
		printConsole("State Code from Response :" +jsonPathEvaluator.getString("data.state_code"));
	}
	
	public void validateResponseforWeather(JsonPath jsonPathEvaluator,String response)
	{
		printConsole("Response Recieved from API -----> " + response);
		printConsole("Time Stamp from Response :" +jsonPathEvaluator.getString("data.datetime"));
		printConsole("Weather code from Response :" +jsonPathEvaluator.getString("data.weather.code"));
		printConsole("Weather Description Response :" +jsonPathEvaluator.getString("data.weather.description"));
	}
	
	public void printConsole(String msg)
	{
		System.out.println(msg);
	}
}
