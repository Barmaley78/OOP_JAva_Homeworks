package org.example.model;

// интерфейс для комплексного числа
public interface CalculateOperationService {
    // сложение двух комплексных чисел
    public void addition(ComplexNumber complexNumber1, ComplexNumber complexNumber2);
    // вычитание двух комплексных чисел
    public void substraction(ComplexNumber complexNumber1, ComplexNumber complexNumber2);
    // умножение двух комплексных чисел
    public void multiplication(ComplexNumber complexNumber1, ComplexNumber complexNumber2);
    // деление двух комплексных чисел
    public void division(ComplexNumber complexNumber1, ComplexNumber complexNumber2);
}
