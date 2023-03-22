package org.example;

import java.util.ArrayList;
import java.util.List;

public class RusWordGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (char myChar = 'а'; myChar < 'я'; myChar++) {
            charList.add(Character.toString(myChar));
        }
        return charList;
    }
}
