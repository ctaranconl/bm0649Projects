package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main kap = new Main();
        int num = sc.nextInt();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i=0;i<num;i++){
            lista.add(sc.nextInt());
        }


        while (num != 0) {

            int valor = lista.get(0);
            lista.remove(0);

            ArrayList<Integer> list = new ArrayList<Integer>();
            list = kap.desglosarNumero(valor);

            int i = 0;
            while (i < 7 && valor != 6174) {
                valor = kap.operar(list,valor);
                list.clear();
                list = kap.desglosarNumero(valor);
                i++;
            }

            if (valor == 0) {
                System.out.println("8");
            } else if (i == 1) {
                System.out.println("0");
            } else {
                System.out.println(i);
            }
            num--;
        }
    }

    public ArrayList<Integer> desglosarNumero(int valor) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int len = Integer.toString(valor).length();
        for (int i = 0; i < len; i++) {
            int digito = valor % 10;
            valor = valor / 10;
            lista.add(digito);
        }
        return lista;
    }

    public Integer operar(ArrayList<Integer> lista,int valor) {
        Collections.sort(lista);
        int val,val2;
        if(lista.size()==2&&(lista.get(0)==0&&lista.get(1)!=0)){
            val=lista.get(1);
            lista.clear();
            lista.add(val);
            lista.add(0);
        }
        if(lista.size()==3&&(lista.get(0)==0&&lista.get(1)==0&&lista.get(2)!=0)){
            val=lista.get(2);
            lista.clear();
            lista.add(val);
            lista.add(0);
            lista.add(0);
        }
        if(lista.size()==3&&(lista.get(0)==0&&lista.get(1)!=0&&lista.get(2)!=0)){
            val=lista.get(1);
            val2=lista.get(2);
            lista.clear();
            if(val>=val2){
                lista.add(val);
                lista.add(val2);
            }else{
                lista.add(val2);
                lista.add(val);
            }
            lista.add(0);

        }
        if(valor<1000){
            if(lista.size()==1) lista.add(0);
            if(lista.size()==2) lista.add(0);
            if(lista.size()==3) lista.add(0);
        }

            int operador1 = 0, operador2 = 0, resultado;

            for (Integer i : lista) {
                operador1 = 10 * operador1 + i;
            }

            Collections.reverse(lista);

            operador2 = invertir(operador1);

            if (operador1 / 1000 < 1) {
                operador2 = operador2 * 10;
            }

            if (operador1 >= operador2) {
                resultado = operador1 - operador2;
            } else {
                resultado = operador2 - operador1;
            }

            return resultado;

    }

    public int invertir(int n) {
        int num = 0;

        while (n > 0) {
            num = num * 10 + n % 10;
            n /= 10;
        }
        return num;
    }
}