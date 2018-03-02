package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> numeros=new ArrayList<>();
        int valor=sc.nextInt();
        numeros.add(valor);

        while(valor!=0){
            valor=sc.nextInt();
            numeros.add(valor);
        }
        numeros.remove(numeros.size()-1);
        while(!numeros.isEmpty()){
            int aux,aux2;
            int num=numeros.get(0);
            numeros.remove(0);
            if(num<10){
                System.out.println(num);
            }else if(num<100){
                aux=num+1;
                boolean b=false;
                while(aux<100&&b==false){
                    aux2=aux;
                    int c1=aux2%10;
                    int c2=aux2/10;
                    if((c1+c2)==num){
                        b=true;
                    }
                    aux++;
                }
                aux--;
                if(b==true) System.out.println(aux);
            }else if(num<1000){
                aux=num+1;
                boolean b=false;
                ArrayList<Integer> val=new ArrayList<>();
                while(b==false){
                    aux2=aux;
                    int suma=0;
                    while(aux2>=10){
                        //val.add(aux2%10);
                        suma=suma+aux2%10;
                        aux2=aux2/10;
                    }
                    suma=suma+aux2;
                    //val.add(aux2);

                    //int tam=val.size();
                    /*for(int i=0;i<tam;i++){
                        suma=suma+val.get(0);
                        val.remove(0);
                    }*/
                    if(suma==num) b=true;
                    aux++;
                }
                aux--;
                if(b==true) System.out.println(aux);
            }
        }
    }
}