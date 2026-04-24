public class Main {
    public static void main(String[] args) {
        /*
        Car car = CarFactory.createCar("gas");
        car.start();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.brake();
        car.stop();
        car.brake();
        car.stop();
        */

        Car car2 = CarFactory.createCar("hybrid");
        car2.start();
        car2.accelerate();
        car2.accelerate();
        car2.accelerate();
        car2.brake();
        car2.brake();
        car2.stop();
        car2.brake();
        car2.stop();

        CarFactory.replaceEngine("gas",car2);

    }
}