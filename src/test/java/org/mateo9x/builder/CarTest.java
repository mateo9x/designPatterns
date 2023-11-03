package org.mateo9x.builder;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CarTest {

    @Test
    public void shouldCreateCar() {
        //given

        //when
        Car car = Car.builder()
                .brand("BRAND")
                .model("MODEL")
                .build();

        //then
        assertThat(car).isNotNull();
        assertEquals(car.getBrand(), "BRAND");
        assertEquals(car.getModel(), "MODEL");
    }

}