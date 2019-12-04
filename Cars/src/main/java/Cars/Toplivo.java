package Cars;

public enum Toplivo {
    ELECTRO("Electrichestvo"),
    BENZIN("Benzin"),
    DIESEL("Dieselnoe toplivo");

    private String toplivoType;

    Toplivo(String toplivoType) {

        this.toplivoType = toplivoType ;
    }
//    public String getValue() {
//        return toplivoType;
//    }
    }