package ru.sberbank.lab3;

public class SecondTask {
    public static void main(String[] args) {//1. Что может сделать JIT-компилятор в этом методе?
        for (int i = 0; i < 50000; i++) {
            Adder adder;
            if (i < 45000) {
                adder = new Simple();
            } else {
                adder = new SimpleWithLogger();
            }
            adder.addARandomNumber(11);
        }
    }
}
