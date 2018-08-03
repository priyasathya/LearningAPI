package JSONserver;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;
import JSONadvancedclasses.Infor;
import JSONadvancedclasses.Postpp;

public class JSONadvanced {

	//refer db_infoadaavanced.json
	
	@Test
	public void Advanced(){
		Infor Info1 = new Infor();
		Info1.Setemail("ädcfghj@xyz.com");
		Info1.Setphone("145236");
		Info1.Setaddress("address1");
		
		Infor Info2 = new Infor();
		Info2.Setemail("ädcfghj@gmail.com");
		Info1.Setphone("145236425");
		Info1.Setaddress("address2");
		
		
		
		Postpp posts = new Postpp();
		posts.setAuthor("Author JK");
		posts.setId("5");
		posts.setTitle("Master");
		//Create Array of Objects in Java
		posts.setInfo(new Infor[]{Info1 ,Info2});
		
		Response resp= given().
				when().
				contentType(ContentType.JSON).
				body(posts).
				post("http://localhost:3000/posts");
		
		System.out.println("response is"+resp.asString());
				
	}
	
}
