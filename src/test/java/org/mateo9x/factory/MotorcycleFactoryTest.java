package org.mateo9x.factory;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorcycleFactoryTest {

    @Test
    public void shouldGetMotorcycleFromFactory() {
        //given
        MotorcycleFactory motorcycleFactory = new MotorcycleFactory();

        //when
        MotorVehicle motorVehicle = motorcycleFactory.createMotorVehicle();
        Boolean vehicleBuilded = motorVehicle.build();

        //then
        assertThat(motorVehicle).isInstanceOf(Motorcycle.class);
        assertEquals(vehicleBuilded, Boolean.FALSE);
    }

}