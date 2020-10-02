public class Vehicle {
    private String vehicleMake;
     private  String vehicleModel;
     private int  topSpeed;

    public Vehicle(String vehicleMake, String vehicleModel, int topSpeed) {
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.topSpeed = topSpeed;
    }
        public String getVehicleMake() {
            return vehicleMake;
        }

        public void setVehicleMake(String vehicleMake) {
            this.vehicleMake = vehicleMake;
        }

        public String getVehicleModel() {
            return vehicleModel;
        }

        public void setVehicleModel(String vehicleModel) {
            this.vehicleModel = vehicleModel;
        }

        public int getTopSpeed() {
            return topSpeed;
        }

        public void setTopSpeed(int topSpeed) {
            this.topSpeed = topSpeed;
        }

    }


