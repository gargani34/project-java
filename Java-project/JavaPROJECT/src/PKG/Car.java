package PKG;

public class Car {

    private int id;
    private static int count;
    private int speed = 0;
    private int maxSpeed =200;
    private OwnerInfo ownerInfo;
    private CarInfo carInfo;

    public Car(CarInfo carInfo) {
        this.id = ++count;
        this.carInfo = carInfo;
    }

    public Car(int speed, CarInfo carInfo) {
        this(carInfo);
        this.setSpeed(speed);
    }

    public Car(String serialNumber, String brand, int speed) {

        this(speed, new CarInfo(serialNumber, brand));
    }

    public void accelerate(int speed){

        this.setSpeed(this.speed + Math.abs(speed));
    }

    public void decelerate(int speed){

        this.speed = (Math.max(0, this.speed - Math.abs(speed)));
    }

    public String compare(Car c1){
        if(this.speed > c1.speed){
            return this.carInfo.getBrand() + " is going faster than " + c1.carInfo.getBrand();
        }else if(this.speed < c1.speed){
            return this.carInfo.getBrand() + " is going slower than " + c1.carInfo.getBrand();
        }else{
            return "Both cars are going at the same speed";
        }
    }

    public static String compare(Car c1, Car c2){

        return c1.compare(c2);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = Math.min(speed, maxSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public OwnerInfo getOwnerInfo() {
        return ownerInfo;
    }

    public void setOwnerInfo(OwnerInfo ownerInfo) {
        this.ownerInfo = ownerInfo;
    }

    public CarInfo getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(CarInfo carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("speed=").append(speed);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", ownerInfo=").append(ownerInfo);
        sb.append(", carInfo=").append(carInfo);
        sb.append('}');
        return sb.toString();
    }

}
