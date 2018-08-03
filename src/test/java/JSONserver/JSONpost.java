package JSONserver;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

import JSONserverclasses.Post;
//refer db.infojson file
public class JSONpost {
//@Test
public void Jsonpost(){
	
	Post posts= new Post(); 
	posts.setid("3");
	posts.settitle("Dummy Dummy Title");
	posts.setAuthor("PriyaQA");
	
	Response resp =given().
			when().
			contentType(ContentType.JSON).
			body(posts).
			post("http://localhost:3000/posts");
	
	System.out.println("Status code is "+resp.getStatusCode());
	//Status code is 201
	System.out.println("response content type :"+resp.contentType());
	//response content type :application/json; charset=utf-8
	System.out.println("String response is:"+resp.asString());
	/*String response is:{
	  "id": "3",
	  "author": "PriyaQA",
	  "title": "Dummy Dummy Title"
	}*/
	
	System.out.println(" response as body is:"+resp.body());
	
	//response as body is:com.jayway.restassured.internal.RestAssuredResponseImpl@9bd0fa6
}

/*i have add 3 rd value in above code ,so to retreive 3 rd value we can write below code which is defined in the json document ie
GET    /posts/1*/

@Test
public void retreive(){
	Response res = given().
                   when().
                   get("http://localhost:3000/posts/3");
	
	System.out.println("response of 3rd" +res.asString());
}
}
