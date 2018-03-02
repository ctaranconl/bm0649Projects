package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Integer> valores = new ArrayList<>();
        ArrayList<String> operadores = new ArrayList<>();

        while (num != 0) {
            String datos = "";
            while (!datos.equals(".")) {
                datos = sc.next();
                if (datos.equals("+") || datos.equals("-") || datos.equals(".")) operadores.add(datos);
                else valores.add(Integer.parseInt(datos));
            }
            num--;
        }

        int resul = 0, i = 0 , cont = 0;

        while (!valores.isEmpty()) {
            if (resul == 0 && cont == 0) {
                resul = valores.get(i);
                valores.remove(i);
            }
            int segundo = valores.get(i);
            valores.remove(i);
            String operador = operadores.get(i);
            operadores.remove(i);
            resul = operar(resul, segundo, operador);
            cont++;
            System.out.print(resul);
            if (!operadores.get(i).equals(".")) System.out.print(", ");
            else {
                System.out.println("");
                resul = 0;
                operadores.remove(i);
                cont = 0;
            }
        }
    }

    public static int operar(int a, int b, String op) {
        int resul;
        if (op.equals("+")) resul = a + b;
        else resul = a - b;
        return resul;
    }
}