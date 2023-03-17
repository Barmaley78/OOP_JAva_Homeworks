package org.example;

public class Contest {
    protected String type;
    protected int size;

    public int getSize() {
        return size;
    }

    public Contest() {
    }

    public Contest(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }
}
