package web.model;

public class Car {
    private int id;
    private String brand;
    private int number;

    public Car(){

    }

    public Car(int id, String brand, int number) {
        this.id = id;
        this.brand = brand;
        this.number = number;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
