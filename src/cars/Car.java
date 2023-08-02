package cars;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;

    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name = " + name + "/n");
        builder.append("Cylinders = " + cylinders + "/n");
        return builder.toString();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
        //return ((Car)o).getCylinders() == getCylinders() && ((Car)o).getName() == getName();
    }


    public void startEngine(){
        System.out.println("the " + getClass().getSimpleName() + "'s engine is starting");

    }
    public void accelerate(){
        System.out.println("the " + getClass().getSimpleName() + " is accelerating");
    }
    public void brake(){
        System.out.println("the " + getClass().getSimpleName() + " is braking");
    }
}
