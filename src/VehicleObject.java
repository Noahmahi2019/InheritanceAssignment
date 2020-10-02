public class VehicleObject {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Corolla", 117, 4, 4, true);
        Car car2 = new Car("Honda", "Civic", 170, 4, 4, true);

        Boat boat1 = new Boat("Boston Whaler", "420 Outrage", 53, true, 4);
        Boat boat2 = new Boat("Draco", "27RS", 44, true, 1);
        System.out.println(car1.getNumberOfDoors());
        System.out.println(car2.getNumberOfWheels());
        System.out.println(boat1.isHasSonarGPS());
        System.out.println(boat2.getNumberOfMotors());
        System.out.println(car1.getVehicleModel());
        System.out.println(boat1.getTopSpeed());

    }
}
