/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalabfinal;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
class base {

    public void area(int l, int w) {
        float area1 = l * w;
        System.out.println("Area:" + area1);

    }

}

class derive extends base{

public void volume(int l, int w, int h) {

        float Volume1 = l * w * h;
        System.out.println("Volume:" + Volume1);

    }

}

public class MethodOverLoading {

    public static void main(String[] args) {

        
        
     Scanner scan = new Scanner(System.in);
      System.out.print("Enter the Lenth Width Height:");
     int a,b,c;
        base obj1 = new base();
        derive obj2 = new derive();
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        obj1.area(a, b);
        obj2.volume(a, b, c);
    }

}
