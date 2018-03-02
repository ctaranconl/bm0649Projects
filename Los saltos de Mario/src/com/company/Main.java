package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int num=sc.nextInt();
        int cont=0;
        int[] arr=new int[num*2];
        while(num!=0){
            int numMuros=sc.nextInt(), ant=0, act;
            int arriba=0,abajo=0;
            while(numMuros!=0) {
                act=sc.nextInt();
                if(ant!=0&&act>ant) arriba++;
                else if(ant!=0&&act<ant) abajo++;
                ant=act;
                numMuros--;
            }
            arr[cont]=arriba;
            arr[cont+1]=abajo;
            cont=cont+2;
            num--;
        }
        for(int i=0;i<arr.length;i=i+2){
            System.out.println(arr[i] + " " + arr[i+1]);
        }
    }
}
