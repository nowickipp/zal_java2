public class Car {
    final String producer;
    final String model;
    Integer horsePower;
    Integer year;
    public Double price;


    public Car(String producer, String model, Integer horsepower, Integer year, Double price) {
        this.producer = producer;
        this.model = model;
        this.horsePower = horsepower;
        this.year = year;
        this.price = price;
    }
}