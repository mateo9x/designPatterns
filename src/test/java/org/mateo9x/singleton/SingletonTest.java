package org.mateo9x.singleton;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

    @Test
    public void shouldCreateSingleton() {
        //given

        //when
        Singleton singleton = Singleton.getInstance();

        //then
        assertThat(singleton).isNotNull();
    }

}