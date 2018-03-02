package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> valores=new ArrayList<>();
        boolean datos=true;
        int i=0;
        while(datos){
            valores.add(sc.nextInt());
            i++;
            if(i>=6&&valores.get(i)==valores.get(i-1)&&valores.get(i-1)==valores.get(i-2)&&valores.get(i)==0){
                datos=false;
                valores.remove(i);
                valores.remove(i-1);
                valores.remove(i-2);
            }
        }

        System.out.println(valores);
    }
}
