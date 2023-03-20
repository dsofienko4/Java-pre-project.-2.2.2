package web.model;

import org.springframework.ui.Model;

public class Car {
    private String Model;
    private String power;
    private String color;

    public Car (String model, String power, String color) {
        Model = model;
        this.power = power;
        this.color = color;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
