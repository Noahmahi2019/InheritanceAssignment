public class Boat extends Vehicle {
    private boolean hasSonarGPS;
    private int  numberOfMotors;

    public Boat(String vehicleMake, String vehicleModel, int topSpeed, boolean hasSonarGPS, int numberOfMotors) {
        super(vehicleMake, vehicleModel, topSpeed);
        this.hasSonarGPS = hasSonarGPS;
        this.numberOfMotors = numberOfMotors;
    }
    public boolean isHasSonarGPS() {
        return hasSonarGPS;
    }
    public void setHasSonarGPS(boolean hasSonarGPS) {
        this.hasSonarGPS = hasSonarGPS;
    }
    public int getNumberOfMotors() {
        return numberOfMotors;
    }
    public void setNumberOfMotors(int numberOfMotors) {
        this.numberOfMotors = numberOfMotors;
    }

}
