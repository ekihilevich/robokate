package test;

import java.util.List;

public class GetOrganizationResponse {
    private int total;
    private List<DataObj> data;

    public GetOrganizationResponse(int total, List<DataObj> data) {
        this.total = total;
        this.data = data;
    }
    public GetOrganizationResponse() {

    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<DataObj> getData() {
        return data;
    }

    public void setData(List<DataObj> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GetOrganizationResponse{" +
                "total=" + total +
                ", data=" + data +
                '}';
    }
}
