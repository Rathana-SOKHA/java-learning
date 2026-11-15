package lession8;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2022);
        Car yourCar = new Car("Honda", "Civic", 2024);

        System.out.println("Car 1: " + myCar.getInfo());
        System.out.println("Car 2: " + yourCar.getInfo());

        myCar.start();
        myCar.accelerate(60);
        myCar.brake(20);
        myCar.stop();

        yourCar.start();
        yourCar.accelerate(80);
        yourCar.brake(30);
        yourCar.stop();
    }
}

class Car {
    private String brand;
    private String model;
    private int year;
    private int speed;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    void start() {
        System.out.println(brand + " " + model + " started.");
    }

    void accelerate(int speedIncrease) {
        if (speedIncrease < 0) {
            System.out.println("Speed increase cannot be negative.");
            return;
        }

        speed += speedIncrease;
        System.out.println(brand + " " + model + " is now moving at " + speed + " km/h.");
    }

    void brake(int speedDecrease) {
        if (speedDecrease < 0) {
            System.out.println("Speed decrease cannot be negative.");
            return;
        }

        speed = Math.max(0, speed - speedDecrease);
        System.out.println(brand + " " + model + " slowed down to " + speed + " km/h.");
    }

    void stop() {
        speed = 0;
        System.out.println(brand + " " + model + " stopped.");
    }

    String getInfo() {
        return year + " " + brand + " " + model;
    }
}
