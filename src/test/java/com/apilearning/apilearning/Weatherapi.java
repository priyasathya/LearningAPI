package com.apilearning.apilearning;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

import javax.annotation.meta.When;


public class Weatherapi {
@Test
//simple get requests
public void Test_01(){
	//correct response
	Response res = when().
					get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	System.out.println("Sttus code:"+res.statusCode());
	Assert.assertEquals(res.statusCode(), 200);
	
}
@Test
public void Test_02(){
	//invalid response
	Response res = when().
			get("http://samples.openweathermap.org/data//weather?q=London,uk&appid=");
System.out.println("Sttus code:"+res.statusCode());
Assert.assertEquals(res.statusCode(), 200);

}
}
