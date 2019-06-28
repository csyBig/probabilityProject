package com.github.csy;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class ProbabilityTest {

    @Test
    public void should_get_andMethod() {
        //given
        Probability beforeAndValue = new Probability((float) 0.5);
        Probability afterAndValue = new Probability((float) 0.8);
        //when

        //then
        // assertThat(5.1).isEqualTo(5, withPrecision(1d));
        assertThat(beforeAndValue.andMethod(afterAndValue)).isEqualToComparingFieldByField(new Probability((float) 0.4));

    }

    @Test
    public void should_get_notMethod() {
        //given
        Probability notValue = new Probability((float) 0.3);
        //when
        //then
        assertThat(notValue.notMethod()).isEqualToComparingFieldByField(new Probability((float) 0.7));

    }

    @Test
    public void should_get_orMethod(){
        //given
        Probability beforeOrValue = new Probability((float) 0.3);
        Probability afterOrValue = new Probability((float) 0.6);
        //when
        //then
        assertThat(beforeOrValue.orMethod(afterOrValue)).isEqualToComparingFieldByField(new Probability((float) 0.72));

    }


}