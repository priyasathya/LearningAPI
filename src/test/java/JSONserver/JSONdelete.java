package JSONserver;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import JSONserverclasses.Post;
import static com.jayway.restassured.RestAssured.*;
public class JSONdelete {
	@Test
	public void requestdelete(){
		
		
		
		
		
		Response resp = given().
				when().
				contentType(ContentType.JSON).
				delete("http://localhost:3000/posts/3");
		
		
		System.out.println("Response after delete :"+resp.toString());
		
		
	}

}
