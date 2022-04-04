package PKG;

import java.util.ArrayList;

public class Parking {

    private String name;
    private String city;
    private String address;
    private ArrayList<Car> cars = new ArrayList<>();

    public Parking(String name, String city, String address) {
        this.name = name;
        this.city = city;
        this.address = address;
    }

    public void add(Car c){

        this.cars.add(c);
    }

    public int countByBrand(String brand){
        return (int) this.cars.stream()
                .filter( c -> c.getCarInfo().getBrand().equals(brand))
                .count();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parking{");
        sb.append("name='").append(name).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", cars amount=").append(cars.size());
        sb.append('}');
        return sb.toString();
    }
}
