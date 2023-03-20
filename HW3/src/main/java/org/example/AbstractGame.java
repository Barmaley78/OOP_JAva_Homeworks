package org.example;

import java.security.SecureRandom;
import java.util.List;
import java.util.ArrayList;

public abstract class AbstractGame implements Game{
    Integer sizeWord;
    String word;
    Integer maxTry;
    static int countTry;
    GameStatus gameStatus = GameStatus.OFF;

    public AbstractGame(Integer sizeWord, String word, Integer maxTry, GameStatus gameStatus) {
        sizeWord = sizeWord;
        this.word = word;
        this.maxTry = maxTry;
        this.gameStatus = gameStatus;
    }

    public AbstractGame() {
    }

    private String generateWord() {
        List<String> charList = generateCharList();
        SecureRandom random = new SecureRandom();
        String res = "";
        int index;
        for (int i = 0; i < sizeWord; i++) {
            index = random.nextInt(charList.size());
            res += charList.get(index);
        }
        return res;
    }

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        word = generateWord();
        this.gameStatus = GameStatus.START;
    }

    @Override
    public Answer inputAnswer(String value) {
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < value.length(); i++) {
            if (word.contains(Character.toString(value.charAt(i)))){
                cow++;
            }
            if(word.charAt(i) == value.charAt(i)){
                bull++;
            }
        }
        countTry++;
        if(countTry > maxTry){
            this.gameStatus = GameStatus.LOOSE;
        }
        else if(bull == sizeWord){
            this.gameStatus = GameStatus.WIN;
        }
        Answer answer = new Answer(cow,bull,value);

        return answer;
    }
    abstract List<String> generateCharList();

    private GameStatus check(String status){
        if(status.equals(word)){
            return gameStatus = GameStatus.WIN;
        }
        else {
            if (countTry >= maxTry) {return gameStatus = GameStatus.LOOSE;}
            else {return gameStatus = GameStatus.START;}
        }
    }
}
