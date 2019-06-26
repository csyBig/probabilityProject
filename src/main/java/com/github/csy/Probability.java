package com.github.csy;

public class Probability {
    private float value;


    public Probability(float inputValue) {
        this.value = inputValue;
    }

    public float getValue() {
        return this.value;
    }

    public Probability andMethod(Probability inputProbability) {
        this.value = this.value * inputProbability.value;
        return this;
    }

    public Probability notMethod() {
        this.value = 1 - this.value;
        return this;
    }

    public Probability orMethod(Probability inputProbability){
        this.value = this.value + inputProbability.value - this.andMethod(inputProbability).value;
        return this;
    }
}
