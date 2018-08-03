package JSONserver;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;
public class Calculateresponsetime {
@Test
public void reponsetime(){
	Response resp =given().
			when().
			get("http://localhost:3000/posts");
	
	Long time = resp.then().
			extract().time();
	
	System.out.println("Get time:"+time);
			
	
}
}
