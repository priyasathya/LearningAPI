package JSONserver;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import JSONserverclasses.Post;
import static com.jayway.restassured.RestAssured.*;
public class JSONput {
	
	
	
	
	
	
	@Test
	public void putrequest(){
	Post posts= new Post(); 
	posts.setid("2");
	posts.settitle("Dummy Dummy jjj Title");
	posts.setAuthor("PriyaQA u");
	
	Response resp = given().
			when().
			contentType(ContentType.JSON).
			body(posts).
			put("http://localhost:3000/posts/2");
	
	
	}
	

}
