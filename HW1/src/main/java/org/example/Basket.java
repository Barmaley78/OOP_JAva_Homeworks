package org.example;

import java.util.ArrayList;

public class Basket {
    public ArrayList<Goods> basketOfGoods;


    public Basket() {
        this.basketOfGoods = new ArrayList<Goods>();
    }

    @Override
    public String toString() {
        String s = "";
        for (Goods item: basketOfGoods) s += item + "\n";
        return s;
    }

    public ArrayList<Goods> getBasketOfGoods() {
        return basketOfGoods;
    }

    public void setBasketOfGoods(ArrayList<Goods> basketOfGoods) {
        this.basketOfGoods = basketOfGoods;
    }

    public void add(Goods good) {
        basketOfGoods.add(good);
    }

}
