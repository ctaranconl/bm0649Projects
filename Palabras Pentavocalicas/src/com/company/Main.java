package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        ArrayList<String> cadenas= new ArrayList<>();

        for(int i=0;i<num;i++) cadenas.add(sc.next());

        while(!cadenas.isEmpty()){
            boolean[] vocales={false,false,false,false,false};
            String evaluar=cadenas.get(0);
            cadenas.remove(0);
            for(int in=0;in<evaluar.length();in++){
                if(evaluar.charAt(in)=='a'){
                    vocales[0]=true;
                }else if(evaluar.charAt(in)=='e'){
                    vocales[1]=true;
                }else if(evaluar.charAt(in)=='i'){
                    vocales[2]=true;
                }else if(evaluar.charAt(in)=='o'){
                    vocales[3]=true;
                }else if(evaluar.charAt(in)=='u'){
                    vocales[4]=true;
                }
            }
            int cont=0;
            for(int j=0;j<5;j++){
                if(vocales[j]==true){
                    cont++;
                }
            }
            if(cont==5){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }

    }
}
