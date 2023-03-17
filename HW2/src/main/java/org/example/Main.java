package org.example;

//        Задание:
//      1)Создайте три класса: Человек, Кот, Робот, которые наследуются от одного класса.
//      Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
//      2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//      должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//      печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
//      (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//      3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//      этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
//      списку препятствий он не идет.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contest> contests = new ArrayList<>();
        contests.add(new Treadmill(150));
        contests.add(new Wall(30));
        contests.add(new Treadmill(350));
        contests.add(new Wall(70));
        contests.add(new Treadmill(700));
        contests.add(new Wall(100));

        ArrayList<SportUnit> units = new ArrayList<>();
        units.add(new Robot("R2D2",1000,20));
        units.add(new Cat("Tom",150,50));
        units.add(new Human("Pechkin",500,120));

        for (int i = 0; i < contests.size(); i++) {
            for (int j = 0; j < units.size(); j++){
//                System.out.println(units.get(j).getContestStatus());
                if(units.get(j).getContestStatus() >= 0){
                    if(contests.get(i).getType().equals("t")){
                        units.get(j).run((Treadmill) contests.get(i));
                    }
                    else{
                        units.get(j).jump((Wall) contests.get(i));
                    }
                }
            }
        }





    }
}