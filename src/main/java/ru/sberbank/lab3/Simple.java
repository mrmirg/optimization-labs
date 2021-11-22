package ru.sberbank.lab3;

class Simple implements Adder {
    @Override
    public void addARandomNumber(double value) {
        double random = Math.random();
        double finalResult = random + value;//1. Что может здесь сделать JIT-компилятор?
    }
}
