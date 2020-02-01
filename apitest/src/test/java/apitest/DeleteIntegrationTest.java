package apitest;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import test.GetToken;

import static io.restassured.RestAssured.given;

public class DeleteIntegrationTest {
    @Test
    public void DeleteIntegrationTest() {

            given()
                .baseUri("http://10.140.3.11")
                .auth().oauth2(GetToken.getToken())
                .accept(ContentType.JSON).contentType(ContentType.JSON)
                .when()
                .delete("/api/protected/vsa/v1/integration")
                .then()
                .statusCode(204);

    }
}
