package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator<Integer> calc = new Calculator<>();
        List<Integer> numbersForSumm = new ArrayList<>(Arrays.asList(5, 8, 45));
        List<Integer> numbersForMults = new ArrayList<>(Arrays.asList(3, 4, 42));
        int value1 = 13;
        int value2 = 7;

        System.out.println(calc.sum(numbersForSumm));
        System.out.println(calc.multiplication(numbersForMults));
        System.out.println(calc.division(value1, value2));
        System.out.println(calc.binaryValue(value1));
    }
}