package test;

public class DataObj {
    private int departmentId;
    private String departmentName;
    private int orgId;
    private String orgName;

    public DataObj(int departmentId, String departmentName, int orgId, String orgName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.orgId = orgId;
        this.orgName = orgName;
    }
    public DataObj() {

    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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

