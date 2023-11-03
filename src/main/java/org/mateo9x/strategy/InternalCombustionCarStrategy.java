package org.mateo9x.strategy;

public class InternalCombustionCarStrategy implements CarStrategy {

    @Override
    public boolean supports(CarType carType) {
        return CarType.INTERNAL_COMBUSTION.equals(carType);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting internal combustion engine...");
    }
}
