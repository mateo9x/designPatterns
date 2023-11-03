package org.mateo9x.strategy;

public class ElectricCarCarStrategy implements CarStrategy {

    @Override
    public boolean supports(CarType carType) {
        return CarType.ELECTRIC.equals(carType);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting electric engine...");
    }
}
