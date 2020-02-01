package apitest;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.GetOrganizationResponse;
import test.GetToken;

import static io.restassured.RestAssured.given;

public class GetOrganizationTest {
    @Test
    public void GetOrganizationTest() {

        GetOrganizationResponse
                response = given()
                .baseUri("http://10.140.3.11")
                .auth().oauth2(GetToken.getToken())
                .accept(ContentType.JSON).contentType(ContentType.JSON)
                .when()
                .queryParam("$top","24")
                .queryParam("$skip","0")
                .get("/api/protected/vsa/v1/mappings/organizations")
                .then()
                .statusCode(200)
                .extract()
                .as(GetOrganizationResponse.class);
        Assert.assertEquals(response.getTotal(), 0);
        System.out.println(response.toString());

    }
}
