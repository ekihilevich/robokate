package test;

public class PostIntegrationResponse {

    private String externalLoginKey;

    public PostIntegrationResponse() {}

    public String getExternalLoginKey() {
        return externalLoginKey;
    }

    public void setExternalLoginKey(String externalLoginKey) {
        this.externalLoginKey = externalLoginKey;
    }

    @Override
    public String toString() {
        return "ObjForPostIntegration{" +
                "externalLoginKey='" + externalLoginKey + '\'' +
                '}';
    }
}
