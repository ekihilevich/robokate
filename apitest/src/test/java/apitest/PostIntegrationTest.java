package apitest;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import test.GetToken;
import test.PostIntegrationResponse;
import static io.restassured.RestAssured.given;

public class PostIntegrationTest {
    @Test
    public void PostIntegrationTest() {

        PostIntegrationResponse
        response = given()
                .baseUri("http://10.140.3.11")
                .auth().oauth2(GetToken.getToken())
                .accept(ContentType.JSON).contentType(ContentType.JSON)
                .when()
                .post("/api/protected/vsa/v1/integration")
                .then()
                .statusCode(200)
                .extract()
              .as(PostIntegrationResponse.class);
        System.out.println(response.toString());

    }
}
