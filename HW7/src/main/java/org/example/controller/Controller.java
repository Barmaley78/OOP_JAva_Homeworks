
package org.example.controller;

import org.example.model.ComplexNumber;
import org.example.view.View;
import org.example.view.Log;
import java.util.Scanner;

public class Controller{
    public Controller() {
    }
    public void init() {
        Scanner in = new Scanner(System.in);
        double realPart;
        double imgPart;
        View view = new View();
        Log log = new Log("calculator");
        System.out.println("введите вешечтвенную часть 1-го комплексного числа");
        realPart = in.nextDouble();
        System.out.println("введите мнимую часть 1-го комплексного числа");
        imgPart = in.nextDouble();
        ComplexNumber cn1 = new ComplexNumber(realPart,imgPart);
        log.print("cn1 = " + view.complexTtoString(cn1) + " определено");
        System.out.println("введите вешечтвенную часть 2-го комплексного числа");
        realPart = in.nextDouble();
        System.out.println("введите мнимую часть 2-го комплексного числа");
        imgPart = in.nextDouble();
        ComplexNumber cn2 = new ComplexNumber(realPart,imgPart);
        log.print("cn2 = " + view.complexTtoString(cn2) + " определено");
        ComplexNumber resCN = new ComplexNumber();
        log.print("Арифметические операции с числами выполняются, их результат");

        resCN.addition(cn1,cn2);
        System.out.println(view.complexTtoString(cn1) + " + " + view.complexTtoString(cn2) + " = " +
                view.complexTtoString(resCN));
        resCN.substraction(cn1,cn2);
        System.out.println(view.complexTtoString(cn1) + " - " + view.complexTtoString(cn2) + " = " +
                view.complexTtoString(resCN));
        resCN.multiplication(cn1,cn2);
        System.out.println(view.complexTtoString(cn1) + " * " + view.complexTtoString(cn2) + " = " +
                view.complexTtoString(resCN));
        resCN.division(cn1,cn2);
        System.out.println(view.complexTtoString(cn1) + " / " + view.complexTtoString(cn2) + " = " +
                view.complexTtoString(resCN));
    }
}
