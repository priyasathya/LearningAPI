package JSONserver;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import junit.framework.Assert;
//manaully add this package
import static com.jayway.restassured.RestAssured.*;
public class JSONserverget {
	@Test
	//GET    /posts
	public void Get(){
		Response res= given().
				when().
				get("http://localhost:3000/posts");
		
		System.out.println("Response value of JSON server:"+res.asString());
				
		
	}
//@Test
//POST   /posts
public void postmethod(){
	Response res= given().
			body(" {\"id\":\"2\","
					+"\"title\" :\"dummy Title\","
							+ "\"author\":\"Priya\"} ").
			when().
			contentType(ContentType.JSON).//check JSON online sheet for every post.put ,patch we need to verify content type
			when().
					post("http://localhost:3000/posts");
	
	System.out.println("res value via post :"+res.asString());
}
}
