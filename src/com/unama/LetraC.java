package com.unama;

import java.util.Scanner;

public class LetraC {
    public static void main(String arg[])
    {
        double base;
        double area;
        double altura;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a base: ");
        base = sc.nextDouble();
        System.out.println("Informe a altura: ");
        altura = sc.nextDouble();
        area = (base*altura)/2;
        System.out.println("A area do triangulo é: "+area);
    }
}
