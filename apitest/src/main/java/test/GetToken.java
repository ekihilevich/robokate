package test;

import static io.restassured.RestAssured.given;
import static test.ToMapConverter.toMap;

public class GetToken {
   public static String token;

    public static  String getToken() {
        PostAuthObject toSend = PostAuthObject.builder()
                .userName("superuser")
                .password("traverse")
                .grantType("password")
                .clientId("VSA")
                .scope("version=1.0 vsa-integration-setup vsa-mappings refreshToken")
                .clientSecret("y9JaZSGUWmlMeHLl")
                .build();
        ObjForTokenResponse response = given()
                .baseUri("http://10.140.3.11")
                .params(toMap(toSend))
                .when()
                .post("/api/oauth/token")
                .then()
                .statusCode(200)
                .extract()
                .as(ObjForTokenResponse.class);
        token = response.getAccessToken();
        return token;

    }
}
