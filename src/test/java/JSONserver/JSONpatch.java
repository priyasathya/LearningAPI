package JSONserver;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import JSONserverclasses.Post;
import static com.jayway.restassured.RestAssured.*;

public class JSONpatch {

	
	
	@Test
	public void pathrequest(){
		
	Post posts = new Post();
	posts.setAuthor("QA QA");
	
	
	Response resp = given().
			when().
			contentType(ContentType.JSON).
			body(posts).
			patch("http://localhost:3000/posts/3");
		
	}
}
