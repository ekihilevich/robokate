package Animals;

public class Enot {
    int weight, height;
    String color, type, name;


    //для первого кота
    public Enot(String color, int weight, int height, String type) {
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.type = type;
    }

    //для второго кота
    public Enot() {

    }

    public String getMove() {
        return color + " enot" + " sidit v nore";
    }

    @Override
    public String toString() {
        return "Enot color - " + color +
                ", Enot weight -" + weight +
                ", Enot height - " + height +
                ", Enot type - " + type;
    }
}