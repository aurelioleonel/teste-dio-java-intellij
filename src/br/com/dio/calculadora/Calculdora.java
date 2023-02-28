package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculdora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("digite o primeiro valor!! ");
        a = scan.nextInt();
        System.out.println("digite o primeiro valor!! ");
        b = scan.nextInt();

        int somar =    somar(a, b);
        int subtrair = subtracao(a, b);
        int mult =     multiplicar(a, b);
        double div =      dividir(a, b);

        System.out.println("Soma "+ somar);
        System.out.println("Subtracao "+ subtrair);
        System.out.println("Multiplicacao "+ mult );
        System.out.println("Divisao "+ div);


    }


    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtracao(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static double dividir(double a, double b){
        return a / b;
    }

}