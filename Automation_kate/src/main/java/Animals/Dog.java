package Animals;

import java.util.Objects;

public class Dog {
    int weight, height;
    String color, poroda, name;




    public Dog(String color, int weight, int height, String poroda) {
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.poroda = poroda;
    }


    public Dog(String name) {
        this.name = name;

    }



    public String getMove() {
        return  "Dog " + name + " run fast";
    }

    @Override
    public String toString() {
        return "Dog color - " + color +
                ", Dog weight -" + weight +
                ", Dog height - " + height +
                ", Dog type - " + poroda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(poroda, dog.poroda);
    }


}

