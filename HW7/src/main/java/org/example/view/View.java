package org.example.view;
import org.example.model.ComplexNumber;

public class View {

    public String complexTtoString(ComplexNumber complexNumber) {
        String realPart;
        String imagePart;
        String result;
        if (complexNumber.getRealPart() != 0) realPart = "" + complexNumber.getRealPart();
        else realPart = "";
        if (complexNumber.getImgPart() != 0) {
            if (complexNumber.getImgPart() > 0) {
                imagePart = "+" + complexNumber.getImgPart() + "i";
            }
            else imagePart = complexNumber.getImgPart() + "i";
        }
        else imagePart = "";
        result = realPart + imagePart;
        return result;
    }
}
