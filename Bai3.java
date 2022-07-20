package HIT_JAVA;

import java.util.Scanner;
public class Bai3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n: ");
        int n = sc.nextInt();
        int tong=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                tong +=i;
            }
        }
        System.out.print("Tong cac uoc cua n= "+tong);
    }
}