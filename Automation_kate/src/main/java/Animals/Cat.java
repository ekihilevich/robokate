package Animals;

import java.util.Objects;

public class Cat {

    int weight;
    int height;
    String color;
    String type;
    String name;



    //first cat
    public Cat(String color, int weight, int height, String type) {
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.type = type;
    }

    //Second cat
    public Cat(String name, String color, int weight, int height, String type) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.type = type;
    }

    public String getMove() {
        return  type + " Cat is lazy";
    }

    @Override
    public String toString() {
        return "Cat color - " + color +
                ", Cat weight -" + weight +
                ", Cat height - " + height +
                ", Cat type - " + type +
                ",Cat name - " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cat) {

            return obj != null && this.color.equals(((Cat) obj).color);
        } return false;

        }
    }





