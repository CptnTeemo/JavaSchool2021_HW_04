package ru.dataart.academy.java;

public class Main {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        try {
            System.out.println("Reverse integer works: " + reverseInteger.reverse(-456));
            System.out.println("Reverse integer works for big negative value: " + reverseInteger.reverse(-2147483648));
            System.out.println("Reverse integer works for big positive value: " + reverseInteger.reverse(2147483647));
            System.out.println("Reverse integer works for big positive value: " + reverseInteger.reverse(-2147483647));
            //В строке выше указано для большого положительного числа, но в скачанном варианте стояло отрицательное
            //Оставил как есть, но добавил уже с положительным числом строку, просто на всякий случай
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}