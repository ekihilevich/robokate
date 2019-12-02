package Cars;

public enum Toplivo {
    ELECTRO("Electrichestvo"),
    BENZIN92("Benzin - 92"),
    BENZIN95("Benzin - 95"),
    DIESEL("Dieselnoe toplivo");
    private String toplivoType;
    Toplivo(String toplivoType) {

        this.toplivoType = toplivoType ;
    }
    public String getValue() {
        return toplivoType;
    }
    }