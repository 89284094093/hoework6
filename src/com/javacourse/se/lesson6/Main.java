package com.javacourse.se.lesson6;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("установите версию приложения по ссылке на Android");
        } else {
            System.out.println("установите приложение по ссылке на IOS");
            //Задание 2
            int deliveryClientYear = 2020;
            int phone = 1;
            if (deliveryClientYear < 2015) {
                if (phone == 1)
                    System.out.println("установить облегченную версию на Android по ссылке");
            } else {
                System.out.println("установить приложение на Android по ссылке");
                if (deliveryClientYear < 2015) {
                    if (phone == 0)
                        System.out.println("установите облегченную версию наiOS");
                } else {
                    System.out.println("установите приложение на IOS по ссылке");
//Задание 3
                    int deliverYear = 2020;
                    if (deliverYear % 4 == 0 && deliverYear % 400 == 0 && deliverYear != 0) {
                        System.out.println("год не высокосный");
                    } else {
                        System.out.println("год высокосный");
                        //Задание4
                        int deliveryDistance=65;
                        int deliveryDays=1;
                        if (deliveryDistance>20) {
                            deliveryDays++;
                        if (deliveryDistance>60) {
                            deliveryDays++;
                        }
                        System.out.println("Потребуется дней "+deliveryDays);
                            //Задание 5
                            int montOFYear=13;
                            switch (montOFYear) {
                                case 12:
                                case 1:
                                case 2:
                                    System.out.println("зимние месяцы");
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    System.out.println("весенние месяцы");
                                    break;
                                case 6:
                                case 7:
                                case 8:
                                    System.out.println("летние месяцы");
                                    break;
                                case 9:
                                case 10:
                                case 11:
                                    System.out.println("осенние месяцы");
                                default:
                                    System.out.println("месяца 13 в году нет");
                            }
                        }
                    }
                }
            }
        }
    }
}
