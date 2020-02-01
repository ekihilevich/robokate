package apitest;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import test.GetToken;
import test.PostOrganizationObj;
import java.util.Collections;

import static io.restassured.RestAssured.given;

public class PostOrganizationTest {
    @Test
    public void PostOrganizationTest() {
        PostOrganizationObj post = new PostOrganizationObj(1,1,"Name");
        given()
                .baseUri("http://10.140.3.11")
                .auth().oauth2(GetToken.getToken())
                .accept(ContentType.JSON).contentType(ContentType.JSON)
                .when()
                .body(Collections.singletonList(post))
                .post("/api/protected/vsa/v1/mappings/organizations")
                .then()
                .statusCode(200);
    }

}
