package Homework01;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Calendar calendar;
        calendar = new GregorianCalendar();
        System.out.println(calendar);
        System.out.println(now);
        System.out.println("Введите имя:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        in.close();
        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
            System.out.println("Доброе утро, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
            System.out.println("Добрый день, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
            System.out.println("Добрый вечер, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
            System.out.println("Доброй ночи, " + name + "!");
        }
    }
}
