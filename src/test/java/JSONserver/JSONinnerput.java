package JSONserver;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;

import JSONserverclasses.Info;
import JSONserverclasses.Pposts;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

public class JSONinnerput {
//this is for one item in info
	/*{
  "posts": [
    { "id": 1, 
	"title": "json-server", 
	 "author": "typicode" ,
	 "info" :{
	 "email " :"xyz@gmail.com",
	 "phone" : "123456",
	 "address" : "address -line"
	 
	 
	 }
	 * 
	 */
	@Test
	public void innerput(){
		Info info = new Info();
		info.setEmail("gyh@gail.com");
		info.setAddress("Address Address");
		info.setPhone("42469");
		
		
		Pposts posts= new Pposts();
		posts.setAuthor("Priya Author1");
		posts.setid("5");
		posts.setTitle("TiTle oooo");
		posts.setInfo(info);
		
		
		Response resp= given().
				when().
				contentType(ContentType.JSON).
				body(posts).
				post("http://localhost:3000/posts");
		
		
		System.out.println("Response is "+resp.asString());
				}
	
	@Test
	public void innerget(){
		Response res= given().
				when().
				get("http://localhost:3000/posts");
		
		System.out.println("Response value of JSON server:"+res.asString());
	}

}
