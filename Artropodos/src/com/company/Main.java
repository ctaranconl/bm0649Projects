package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);

	    int num;

	    num=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<Integer> resultados=new ArrayList<>();

	    while(num!=0){
			for(int x=0;x<5;x++){
				list.add(sc.nextInt());
			}
			int patas=0;
            patas=patas+(list.get(0)*6);
	        patas=patas+(list.get(1)*8);
	        patas=patas+(list.get(2)*10);
	        patas=patas+(list.get(3)*(list.get(4)*2));
	        resultados.add(patas);
	        list.clear();
	        num--;
        }
        for(int z=0;z<resultados.size();z++){
	    	System.out.println(resultados.get(z));
		}
    }
}
