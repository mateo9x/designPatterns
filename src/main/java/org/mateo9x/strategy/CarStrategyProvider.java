package org.mateo9x.strategy;

import java.util.Arrays;
import java.util.List;

public class CarStrategyProvider {
    List<CarStrategy> strategies = Arrays.asList(new InternalCombustionCarStrategy(), new ElectricCarCarStrategy());

    public CarStrategy findStrategy(CarType carType) {
        return strategies.stream()
                .filter(strategy -> Boolean.TRUE.equals(strategy.supports(carType)))
                .findFirst()
                .orElseThrow();
    }
}
