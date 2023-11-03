package org.mateo9x.builder;

public class Car {

    private String brand;
    private String model;

    private Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String brand;
        private String model;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Car build() {
            return new Car(brand, model);
        }
    }
}
