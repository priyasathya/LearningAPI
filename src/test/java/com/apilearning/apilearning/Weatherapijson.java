package com.apilearning.apilearning;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class Weatherapijson {

	@Test
	public void Jsonparsing(){
		String weatherreport = given().
				parameter("id","2172797").
				parameter("appid","b6907d289e10d714a6e88b30761fae22").
				when().
				get("http://samples.openweathermap.org/data/2.5/weather").
				then().
				contentType(ContentType.JSON).
				extract().
				path("weather[0].description");
		
		System.out.println("Weather report :"+weatherreport);
				
		
	}
	
	@Test
	public void StdJsonparsing(){
		Response res = given().
				parameter("id","2172797").
				parameter("appid","b6907d289e10d714a6e88b30761fae22").
		when().
		get("http://samples.openweathermap.org/data/2.5/weather");
		
		
		
		String actualweatherreport =res.then().
				contentType(ContentType.JSON).
				extract().
				path("weather[0].description");
		
		String expectedresult= null;
		if(actualweatherreport .equalsIgnoreCase(expectedresult)){
			System.out.println("Test is passsed");
			
		}else{
			System.out.println("Test is Failed");
		}
		
		
	}

}
