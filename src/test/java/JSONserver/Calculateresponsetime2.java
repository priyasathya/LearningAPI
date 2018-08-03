package JSONserver;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;
import org.testng.annotations.Test;
//need to import static package for lesstime
public class Calculateresponsetime2 {
@Test
public void time(){
	given().
	when().
	get("http://localhost:3000/posts").
	then().
	and().
	time(lessThan(10L));
	
	
}
}
