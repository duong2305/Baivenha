package HIT_JAVA;

import java.util.Scanner;

public class Bai2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao canh a: ");
        float a = sc.nextInt();
        System.out.print("Nhap vao canh b: ");
        float b = sc.nextInt();
        System.out.print("Nhap vao canh c: ");
        float c = sc.nextInt();

        if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)
        {
            System.out.print("Day la tam giac vuong");
            if(a==b || a==c || c==b)
            {
                System.out.print("Day la tam giac vuong can");
            }
        }
        else if(a==b || a==c || c==b)
        {
            System.out.print("Day la tam giac can");
            if(a==b && b==c)
            {
                System.out.print("Day la tam giac deu");
            }
        }
        else
            System.out.print("Day la tam giac thuong");
    }
}
