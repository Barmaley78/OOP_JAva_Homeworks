package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Goods> temp = new ArrayList<>();
        Goods orange = new Goods("Апельсины",120.95,100);
        Goods apple = new Goods("Яблоки",115.96,100);
        Goods banana = new Goods("Бананны",95.99,100);
        Category fruits = new Category();
        fruits.setName("Фрукты");
        temp.add(orange);
        temp.add(apple);
        temp.add(banana);
        fruits.setArrayOfGoods(temp);
        Goods potato = new Goods("Картофель",36.99,100);
        Goods tomato = new Goods("Помидоры",160.90,100);
        Goods onion = new Goods("Лук репчатый",45.99,100);
        ArrayList<Goods> catalog = new ArrayList<>();
        catalog.addAll(temp);
        temp.clear();
        Category vegatables = new Category();
        vegatables.setName("Овощи");
        temp.add(potato);
        temp.add(tomato);
        temp.add(onion);
        vegatables.setArrayOfGoods(temp);
        catalog.addAll(temp);
        temp.clear();
        System.out.println("Shop catalogue: ");
        for (Goods item: catalog){
            System.out.println(item.toString());
        }

        Basket user1Basket = new Basket();
        Basket user2Basket = new Basket();
        User user1 = new User("user1","123",user1Basket);
        User user2 = new User("user2","234",user2Basket);
        user1Basket.add(orange);
        user1Basket.add(onion);
        user2Basket.add(potato);
        user2Basket.add(tomato);

        System.out.println();

        System.out.println("User 1 basket contains: ");
        System.out.println(user1Basket.toString());

        System.out.println("User 2 basket contains: ");
        System.out.println(user2Basket.toString());


        user1.buyGoods(user1Basket, catalog);
        user2.buyGoods(user2Basket, catalog);

        System.out.println("Shop catalogue left: ");
        for (Goods item: catalog){
            System.out.println(item.toString());
        }
        //System.out.println("Hello world!");
    }
}