package org.mateo9x.strategy;


import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarStrategyProviderTest {

    @ParameterizedTest
    @MethodSource("properData")
    public void shouldGetProperCarStrategy(CarType carType, Class carStrategyClass) {
        //given
        CarStrategyProvider carStrategyProvider = new CarStrategyProvider();

        //when
        CarStrategy carStrategy = carStrategyProvider.findStrategy(carType);

        //then
        assertEquals(carStrategy.getClass(), carStrategyClass);
    }

    @Test
    public void shouldThrowExceptionWhenStrategyDoesntExists() {
        //given
        CarStrategyProvider carStrategyProvider = new CarStrategyProvider();

        //when
        Throwable throwable = catchThrowable(() -> carStrategyProvider.findStrategy(CarType.NOT_EXISTING));

        //then
        assertThat(throwable).isInstanceOf(RuntimeException.class);
    }

    private static Stream<Arguments> properData() {
        return Stream.of(
                Arguments.of(CarType.ELECTRIC, ElectricCarCarStrategy.class),
                Arguments.of(CarType.INTERNAL_COMBUSTION, InternalCombustionCarStrategy.class)
        );
    }

}