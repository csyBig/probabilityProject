package com.github.csy;

public class Probability {
    private float value;

    public Probability(float inputValue) {
        this.value = inputValue;
    }

    public Probability andMethod(Probability inputProbability) {
        return new Probability(this.value * inputProbability.value);
    }

    public Probability notMethod() {
        return new Probability(this.value = 1 - this.value);
    }

    public Probability orMethod(Probability inputProbability){
        return new Probability(this.value + inputProbability.value - this.andMethod(inputProbability).value);
    }
}
