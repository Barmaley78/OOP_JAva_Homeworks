package org.example;

public class Answer {
    private Integer cows;
    private Integer bulls;
    private String userInput;


    public Integer getCows() {
        return cows;
    }

    public void setCows(Integer cows) {
        this.cows = cows;
    }

    public Integer getBulls() {
        return bulls;
    }

    public void setBulls(Integer bulls) {
        this.bulls = bulls;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public Answer(Integer cows, Integer bulls, String userInput) {
        this.cows = cows;
        this.bulls = bulls;
        this.userInput = userInput;
    }
    public Answer() {
    }

    @Override
    public String toString() {
        return "Answer{" +
                "cows=" + cows +
                ", bulls=" + bulls +
                ", userInput='" + userInput + '\'' +
                '}';
    }
}
