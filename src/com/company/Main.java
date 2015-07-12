package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int i,j,k,n;
        BufferedReader bf;
        String input = "";

        System.out.println("Isosceles Triangle : ");
        System.out.println("Enter n : ");

        bf = new BufferedReader(new InputStreamReader(System.in));

        try{
            input = bf.readLine();
        }
        catch(Exception e){}


        n = Integer.parseInt(input);

        for(i=0;i<n;i++){
            for(k=0;k<(n-1)-i;k++){
                System.out.print(" ");
            }

            j = (2*i) + 1;
            for(k=0;k<j;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        System.out.println("Diamond : ");
        System.out.println("Enter n : ");

        bf = new BufferedReader(new InputStreamReader(System.in));

        try{
            input = bf.readLine();
        }
        catch(Exception e){}

        n = Integer.parseInt(input);
        for(i=0;i<n;i++){
            for(k=0;k<(n-1)-i;k++){
                System.out.print(" ");
            }

            j = (2*i) + 1;
            for(k=0;k<j;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i-=2;i>=0;i--){
            for(k=0;k<(n-1)-i;k++){
                System.out.print(" ");
            }

            j = (2*i) + 1;
            for(k=0;k<j;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        System.out.println("Diamond with name : ");
        System.out.println("Enter n : ");

        bf = new BufferedReader(new InputStreamReader(System.in));

        try{
            input = bf.readLine();
        }
        catch(Exception e){}

        n = Integer.parseInt(input);
        for(i=0;i<n-1;i++){
            for(k=0;k<(n-1)-i;k++){
                System.out.print(" ");
            }

            j = (2*i) + 1;
            for(k=0;k<j;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Purnank");
        for(i--;i>=0;i--){
            for(k=0;k<(n-1)-i;k++){
                System.out.print(" ");
            }

            j = (2*i) + 1;
            for(k=0;k<j;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }
}
