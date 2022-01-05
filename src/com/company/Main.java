package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Введите ваше имя");
        Scanner Play = new Scanner(System.in);
        System.out.println(Play.nextLine());
        System.out.println("Здраствуйте " + Play.nextLine());

    }
}
