public class Car extends Vehicle{
    private int numberOfDoors;
     private  int numberOfWheels;
     private  boolean isAutomatic;

    public Car(String vehicleMake, String vehicleModel, int topSpeed, int numberOfDoors, int numberOfWheels, boolean isAutomatic) {
        super(vehicleMake, vehicleModel, topSpeed);
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
        this.isAutomatic = true;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public boolean isAutomatic() {
        return isAutomatic;
    }
    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

}
