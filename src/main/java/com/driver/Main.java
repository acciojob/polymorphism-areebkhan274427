package com.driver;

import java.util.Scanner;

public class Main {

    public static class Product{

        public int Product(int x,int y){
            return x*y;
        }
        public int Product(int x,int y,int z){
            return x*y*z;
        }
        public double Product(double x,double y){
            return x*y;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product p=new Product();
        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        double a,b;
        a=sc.nextDouble();
        b=sc.nextDouble();

        p.Product(x,y);
        p.Product(x,y,z);
        p.Product(a,b);



    }
}