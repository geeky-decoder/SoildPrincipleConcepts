import java.time.LocalDate;

// Model class for smatphone parameters
public class Smartphone {

    private String brand;
    private String color;
    private double price;
    private LocalDate manufacturingDate;

    public Smartphone(String brand, String color, double price, LocalDate manufacturingDate) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getManufacturingDate() {
        return this.manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }
}
