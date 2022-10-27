package br.com.dio.exercicios;

/**
 * Calculadora
 */
public class Calculadora {
    public static void adicao(double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("A Adição de " + numero1 + " por " + numero2 + " é: " + resultado);
    }

    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("A Subtração de " + numero1 + " por " + numero2 + " é: " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("A Multiplicação de " + numero1 + " por " + numero2 + " é: " + resultado);
    }

    public static void divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println("A Divisão de " + numero1 + " por " + numero2 + " é: " + resultado);
    
    }
}