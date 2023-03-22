package org.example;

import java.util.Scanner;

/*ы
Домашнее задание № 3

Вот полный список доработок по задаче быки - коров:
1) доделать вариации с игрой на английском/русском языке, сигнатуры уже приведены в прикрепленном файле
2) улучшить интерфейсную часть игры
3) * создать историю ходов и по окончании игры вывести её, в зависимости от ответа пользователя
(y-вывести, n -выводить не следует)
*/
public class Main {
    public static void main(String[] args) {
        int choice = 15;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Выберите вариант игры \n");
            System.out.println("1 - игра с цифрами");
            System.out.println("2 - игра с английскими буквами");
            System.out.println("3 - игра с русскими буквами");
            System.out.println("0 - Завершение");
            System.out.println("Вветите пункт меню ");
            choice = scanner.nextInt();

            Game game = null;

            switch (choice) {
                case 1:
                    game = new NumberGame();
                    break;
                case 2:
                    game = new EnWordGame();
                    break;
                case 3:
                    game = new RusWordGame();
                    break;
                default:
                    System.out.println("Выключаюсь");
                    System.exit(0);
            }

            game.start(2, 10);

            while (game.getGameStatus().equals(GameStatus.START)) {
                System.out.println("Введите ответ ");
                String userAnswer = scanner.next();
                Answer pcAnswer = game.inputAnswer(userAnswer);
                System.out.println(String.format("Найдено %d быков и %d коров", pcAnswer.getBulls(), pcAnswer.getCows()));
            }

            if (game.getGameStatus().equals(game.getGameResult())) {
                System.out.println("Вы выиграли!");
            } else {
                System.out.println("Вы проиграли!");
            }


            System.out.println();
        }
    }
}