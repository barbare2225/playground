package company;

import java.math.BigDecimal;

public class Tax {

    private BigDecimal price;
    private String location; // from project/equipment/problem

    public Tax(BigDecimal price, String location) {
        this.price = price;
        this.location = location;
    }

    // getters and setters
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void print() {
        System.out.println("Tax: " + price);
    }

    public BigDecimal getTotal(){
        return this.price.multiply(new BigDecimal(this.location));
    }

    public void printName(){
        System.out.println("name is tax");
        System.out.println("hi");
        System.out.println("Tax: " + price);
        System.out.println();
        System.out.println("name is -"+" forgot it doesnt have name");
    }
}
