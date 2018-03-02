package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] array=new int[num];
        for(int i=0;i<num;i++){
            array[i]=sc.nextInt();
        }
        int i=0;
        while (num!=0) {

            if(array[i]>4){
                System.out.println("0");
            }else if(array[i]==4) {
                System.out.println("4");
            }else if(array[i]==3) {
                System.out.println("6");
            }else if(array[i]==2) {
                System.out.println("2");
            }else if(array[i]==1||array[i]==0) {
                System.out.println("1");
            }
            num--;
            i++;
        }
    }
}
