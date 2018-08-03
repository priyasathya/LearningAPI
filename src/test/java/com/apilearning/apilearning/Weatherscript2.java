package com.apilearning.apilearning;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;
public class Weatherscript2 {
	//@Test
	public void Test_03(){
	Response response = given().
			param("q" ,"London").
			param("appid","b6907d289e10d714a6e88b30761fae22").
			when().
			get("http://samples.openweathermap.org/data/2.5/weather");
	System.out.println("Sttus code:"+response.statusCode());
	Assert.assertEquals(response.statusCode(), 200);

}
	@Test
	public void Test_04(){
	Response response = given().
			param("id" ,"2172797").
			param("appid","b6907d289e10d714a6e88b30761fae22").
			when().
			get("http://samples.openweathermap.org/data/2.5/weather");
	System.out.println("Sttus code:"+response.statusCode());
	Assert.assertEquals(response.statusCode(), 200);
	System.out.println(response.asString());
	//System.out.println(response);
	

	
	
}}