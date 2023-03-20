package org.example;

import java.util.ArrayList;
import java.util.List;

public class RusWordGame extends AbstractGame{
    @Override
    public GameStatus getGameStatus() {
        List<String> charList = new ArrayList<String>();
        for (char myChar = 'а'; myChar < 'я'; myChar++) {
            charList.add(Character.toString(myChar));
        }
        return charList;
    }
}
