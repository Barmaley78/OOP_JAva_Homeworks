package org.example.model;

public class ComplexNumber implements CalculateOperationService {
    private double realPart;
    private double imgPart;

    public ComplexNumber(double realPart, double imgPart) {
        this.realPart = realPart;
        this.imgPart = imgPart;
    }
    public ComplexNumber() {
    }
    @Override
    public void addition(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        setRealPart(complexNumber1.getRealPart() + complexNumber2.getRealPart());
        setImgPart(complexNumber1.getImgPart() + complexNumber2.getImgPart());
    }
    @Override
    public void substraction(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        setRealPart(complexNumber1.getRealPart() - complexNumber2.getRealPart());
        setImgPart(complexNumber1.getImgPart() - complexNumber2.getImgPart());
    }
    @Override
    public void multiplication(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        setRealPart(
                complexNumber1.getRealPart() * complexNumber2.getRealPart() -
                        complexNumber1.getImgPart() * complexNumber2.getImgPart()
        );
        setImgPart(
                complexNumber1.getImgPart() * complexNumber2.getRealPart() +
                        complexNumber1.getRealPart() * complexNumber2.getImgPart()
        );
    }
    @Override
    public void division(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        setRealPart(
                (complexNumber1.getRealPart() * complexNumber2.getRealPart() +
                        complexNumber1.getImgPart() * complexNumber2.getImgPart()) /
                        (complexNumber2.getRealPart() * complexNumber2.getRealPart() +
                                complexNumber2.getImgPart() * complexNumber2.getImgPart())
        );
        setImgPart(
                (complexNumber1.getImgPart() * complexNumber2.getRealPart() -
                        complexNumber1.getRealPart() * complexNumber2.getImgPart()) /
                        (complexNumber2.getRealPart() * complexNumber2.getRealPart() +
                                complexNumber2.getImgPart() * complexNumber2.getImgPart())
        );
    }
    public double getRealPart() {
        return realPart;
    }
    public double getImgPart() {
        return imgPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImgPart(double imgPart) {
        this.imgPart = imgPart;
    }
}
