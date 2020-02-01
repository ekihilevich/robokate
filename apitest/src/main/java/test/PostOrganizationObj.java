package test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostOrganizationObj {
    @JsonProperty(value = "DEPARTMENT_ID")
    private int departmentId;
    @JsonProperty(value = "ORG_ID")
    private int orgId;
    @JsonProperty(value = "ORG_NAME")
    private String orgName;

    public PostOrganizationObj(int departmentId, int orgId, String orgName) {
        this.departmentId = departmentId;
        this.orgId = orgId;
        this.orgName = orgName;
    }
    public PostOrganizationObj() {

    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
}
