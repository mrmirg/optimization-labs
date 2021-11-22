package ru.sberbank.lab3;

class SimpleWithLogger implements Adder {
    @Override
    public void addARandomNumber(double value) {
        System.out.println("The value is: " + Math.random() + value);
    }
}
