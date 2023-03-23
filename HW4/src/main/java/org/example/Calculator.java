package org.example;

import java.util.List;

public class Calculator <N extends Integer>{
    public Calculator(){}

    public Double sum(List<N> items){
        double summ = 0.0;
        for(N i: items) summ += i.doubleValue();
        return summ;
    }

    public Double multiplication(List<N> items){
        double mult = 1.0;
        for(N i: items) mult = mult * i.doubleValue();
        return mult;
    }

    public Double division(N num1, N num2){
        return num1.doubleValue() / num2.doubleValue();
    }

    public String binaryValue(N num){
        String res = "";
        int temp = num.intValue();
        while (temp != 0){
            res = temp % 2 + res;
            temp = temp / 2;
        }
        return res;
        //return Integer.toBinaryString(num);
    }


}
