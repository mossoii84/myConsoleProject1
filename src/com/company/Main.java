package com.company;

import com.company.products.Fruit;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    private  static List<String> listFruit= new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        //ВАРИАНТ 1 со new Scanner
        System.out.println("Введите число для выбора действия");
        System.out.println("Добавить товар");
        System.out.println("Удалить товар");
        System.out.println("Показать склад");
        System.out.println("Выйти");
        System.out.println("Назад");

        commandLooper: while(true) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();//Считываем введеное число
            switch (a) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    showProduct();
                    break;
                case 0:
//                System.out.println("Выбрано = Выйти");
                    break commandLooper;
                default :
                    System.out.println("Такого варианта нет!!!");
                    break commandLooper;
            }
        }

    }



    public static void  addProduct() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Fruit fruit = new Fruit();
        System.out.println("Выбрано = добавьте товар,введите товар");
        String name = scanner.next();
        fruit.setName(name);
        listFruit.add(fruit.getName(name));
        System.out.println("массив " + listFruit);

        //запись в фаил, переписывается при перезапуске проги
                for (String v : listFruit) {
                System.out.println(v);
                PrintWriter outputfile = new PrintWriter(
        "/Users/macos/IdeaProjects/myConsoleProject1/src/com/company/mysave.txt");
                    outputfile.print(v);
                    outputfile.close();
                }
    }

    public static void removeProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбрано = удалить товар,введите товар");
        String name = scanner.next();
        listFruit.remove(name);
        System.out.println("массив " + listFruit);
    }

    public static void showProduct(){
////        Вариант 1
//        for(int i = 1; i < listFruit.toArray().length; i++){
//            System.out.println(i + "."+ listFruit.get(i));
//        }

//       Вариант 2
        int t=1;
        for (String f : listFruit) {
            System.out.println(t++ +"." + f);
            }
//
//        //Вариант 3
//        Iterator iterator = listFruit.iterator();
//        int i=1;
//        while(iterator.hasNext()) {
//            System.out.println(i++ +"."+ iterator.next());
//        }


    }




}








