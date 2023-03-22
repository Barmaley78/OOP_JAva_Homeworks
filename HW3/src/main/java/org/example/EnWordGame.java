package org.example;

import java.util.ArrayList;
import java.util.List;

public class EnWordGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 97; i < 123; i++) {
            charList.add(Character.toString((char) i));
        }
        return charList;
    }
}
