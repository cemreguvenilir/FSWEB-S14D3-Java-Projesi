import cars.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car car = new Car(8, "Base car");
        car.startEngine();
        car.accelerate();
        car.brake();
        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();
        Car ford = new Ford(6, "Ford Falcon");
        ford.startEngine();
        ford.accelerate();
        ford.brake();
        Car holden = new Holden(6, "Holden Commodore");
        holden.startEngine();
        holden.accelerate();
        holden.brake();

        CarSkeleton car1 = new ElectricCar("Tesla", "tesla aracı", 100, 20);
        CarSkeleton car2 = new GasPoweredCar("Audi", "a5", 5, 4 );
        CarSkeleton car3 = new HybridCar("BMW", "adsf", 3, 25, 5);
        car1.drive();
        car2.drive();
        car3.drive();


}}