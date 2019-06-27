package com.github.csy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProbabilityTest {

    @Test
    public void should_get_andMethod() {
        //given
        Probability beforeAndValue = new Probability((float) 0.5);
        Probability afterAndValue = new Probability((float) 0.8);
        //when

        //then
        Assert.assertEquals( 0.4, beforeAndValue.andMethod(afterAndValue).getValue(), 0.00001);
    }

    @Test
    public void should_get_notMethod() {
        //given
        Probability notValue = new Probability((float) 0.3);
        //when
        //then
        Assert.assertEquals(0.7, notValue.notMethod().getValue(), 0.00001);

    }

    @Test
    public void should_get_orMethod(){
        //given
        Probability beforeOrValue = new Probability((float) 0.3);
        Probability afterOrValue = new Probability((float) 0.6);
        //when
        //then
        Assert.assertEquals(0.72, beforeOrValue.orMethod(afterOrValue).getValue(), 0.00001);

    }


}