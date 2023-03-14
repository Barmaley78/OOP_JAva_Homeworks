package org.example;

import java.util.ArrayList;

public class User {
    public String login;
    protected String password;
    public Basket UserBasket;

    public User(String login, String password, Basket userBasket) {
        this.login = login;
        this.password = password;
        this.UserBasket = userBasket;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }


    public Basket getUserBasket() {
        return UserBasket;
    }

    public void buyGoods(Basket b, ArrayList<Goods> cat){
        for (Goods item: b.basketOfGoods) {
            if (cat.contains(item)) cat.remove(item);
        }
    }

}
