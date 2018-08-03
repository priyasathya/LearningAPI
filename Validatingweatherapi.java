package com.apilearning.apilearning;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import junit.framework.Assert;

import static com.jayway.restassured.RestAssured.*;

public class Validatingweatherapi {
	@Test
	public void validateweather(){
		Response resp=given().
				param("id","2172797").
				param("appid","b6907d289e10d714a6e88b30761fae22").
				when().
				get("http://samples.openweathermap.org/data/2.5/weather");
		String actualweatherreportID=resp.then().
				contentType(ContentType.JSON).
				extract().
				path("weather[0].description");
		
		System.out.println("Actual weather report is:"+actualweatherreportID);
		
		String longititude= String.valueOf(resp.then().
				     contentType(ContentType.JSON).
				     extract().
				     path("coord.lon"));//using JSON ectractor got this :coor.lon
		
		System.out.println("Longititude value is"+longititude);
		
		String latitude =String .valueOf(resp.then().
				      contentType(ContentType.JSON).
				      extract().
				      path("coord.lat"));
		
		System.out.println("Latitude value is"+latitude);
		//http://samples.openweathermap.org/data/2.5/weather?lat&lon&appid=b6907d289e10d714a6e88b30761fae22
		
		String respcoordinates = given().
				param("lat",latitude).
				param("lon",longititude).
				param("appid","b6907d289e10d714a6e88b30761fae22").
				when().
				get("http://samples.openweathermap.org/data/2.5/weather").
				then().
				contentType(ContentType.JSON).
				extract().
				path("weather[0].description");
		
		System.out.println("Respcoordinates:"+respcoordinates);
		
		Assert.assertEquals(actualweatherreportID, respcoordinates);
		
		
				
				
				
				
		
	}

}
