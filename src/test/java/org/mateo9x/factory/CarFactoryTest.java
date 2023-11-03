package org.mateo9x.factory;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarFactoryTest {

    @Test
    public void shouldGetCarFromFactory() {
        //given
        CarFactory carFactory = new CarFactory();

        //when
        MotorVehicle motorVehicle = carFactory.createMotorVehicle();
        Boolean vehicleBuilded = motorVehicle.build();

        //then
        assertThat(motorVehicle).isInstanceOf(Car.class);
        assertEquals(vehicleBuilded, Boolean.TRUE);
    }

}