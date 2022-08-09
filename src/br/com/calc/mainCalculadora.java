package br.com.calc;
import java.util.Scanner;
/*
Faça uma calculadora capaz de receber até 5 números como parâmetro.
 */
public class mainCalculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Calculadora operacao1 = new Calculadora();
        operacao1.getSomar(4,6,8,7,9);
        operacao1.getDividir(8,4);
        operacao1.getSubtrair(8,6,1);
        operacao1.getMultiplicar(8,4,10,3,2);
    }
}
/*

 */