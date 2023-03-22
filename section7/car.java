package section7;

public class car {
    private String cname;
    private String model;
    private int wheels;
    private int price;

    public car(String name, String model, int price){
        cname = name;
        this.model = model;
        this.price = price;
        wheels = 4;
    }
    public car(){}

    public car(car source){
        this.cname = source.cname;
        this.model = source.model;
        this.price = source.price;
        this.wheels = source.wheels;
    }

    public String getCname() {
        return this.cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
