package org.example;

import java.util.ArrayList;

public class Category {
    public String name;
    public ArrayList<Goods> arrayOfGoods;

    public Category(String name, ArrayList<Goods> arrayOfGoods) {
        this.name = name;
        this.arrayOfGoods = arrayOfGoods;
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Goods> getArrayOfGoods() {
        return arrayOfGoods;
    }

    public void setArrayOfGoods(ArrayList<Goods> arrayOfGoods) {
        this.arrayOfGoods = arrayOfGoods;
    }
}
