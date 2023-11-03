package org.mateo9x.strategy;

public interface CarStrategy {
    boolean supports(CarType carType);
    void startEngine();
}
