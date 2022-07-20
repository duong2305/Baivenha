package HIT_JAVA;

import java.util.Scanner;

public class Bai1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ngay sinh: ");
        int a = sc.nextInt();
        System.out.print("Nhap vao thang sinh: ");
        int b = sc.nextInt();
        System.out.print("Nhap vao nam sinh: ");
        int c = sc.nextInt();
        switch(b)
        {
            case 1:
                if(a>=1 && a<=19)
                {
                    System.out.print("Ban thuoc cung Ma Ket.");
                }
                else if(a<=31)
                {
                    System.out.print("Ban thuoc cung Bao Binh");
                }
                else
                {
                    System.out.print("Ngay sinh khong hop le");
                }
                break;
            case 2:
                if(a>=1 && a<=18)
                {
                    System.out.print("Ban thuoc cung Bao Binh");
                }
                else if(c%4==0 && c%100!=0 || c%400==0)
                {
                    if(a<=29)
                    {
                        System.out.print("Ban thuoc cung Song Ngu");
                    }
                    else
                    {
                        System.out.print("Ngay sinh khong hop le");
                    }
                }
                else
                {
                    if(a<=28)
                    {
                        System.out.print("Ban thuoc cung Song Ngu");
                    }
                    else
                    {
                        System.out.print("Ngay sinh khong hop le");
                    }
                }
                break;
            case 3:
                if(a>=1 && a<=20)
                {
                    System.out.print("Ban thuoc cung Song Ngu.");
                }
                else if(a<=31)
                {
                    System.out.print("Ban thuoc cung Bach Duong");
                }
                else
                {
                    System.out.print("Ngay sinh khong hop le");
                }
                break;
            case 4:
                if(a>=1 && a<=20)
                {
                    System.out.print("Ban thuoc cung Bach Duong.");
                }
                else if(a<=30)
                {
                    System.out.print("Ban thuoc cung Kim Nguu");
                }
                else
                {
                    System.out.print("Ngay sinh khong hop le");
                }
                break;
            case 5:
                if(a>=1 && a<=20)
                {
                    System.out.print("Ban thuoc cung Kim Nguu.");
                }
                else if(a<=31)
                {
                    System.out.print("Ban thuoc cung Song Tu");
                }
                else
                {
                    System.out.print("Ngay sinh khong hop le");
                }
                break;
            case 6:
                if(a>=1 && a<=21)
                {
                    System.out.print("Ban thuoc cung Song Tu.");
                }
                else if(a<=30)
                {
                    System.out.print("Ban thuoc cung Cu Giai");
                }
                else
                {
                    System.out.print("Ngay sinh khong hop le");
                }
                break;
            case 7:
                if(a>=1 && a<=22)
                {
                    System.out.print("Ban thuoc cung Cu Giai.");
                }
                else if(a<=31)
                {
                    System.out.print("Ban thuoc cung Su Tu");
                }
                else
                {
                    System.out.print("Ngay sinh khong hop le");
                }
                break;
            case 8:
                if(a>=1 && a<=22)
                {
                    System.out.print("Ban thuoc cung Su Tu.");
                }
                else if(a<=31)
                {
                    System.out.print("Ban thuoc cung Xu nu");
                }
                else
                {
                    System.out.print("Ngay sinh khong hop le");
                }
                break;
            case 9:
                if(a>=1 && a<=22)
                {
                    System.out.print("Ban thuoc cung Xu Nu.");
                }
                else if(a<=30)
                {
                    System.out.print("Ban thuoc cung Thien Binh");
                }
                else
                {
                    System.out.print("Ngay sinh khong hop le");
                }
                break;
            case 10:
                if(a>=1 && a<=23)
                {
                    System.out.print("Ban thuoc cung Thien Binh.");
                }
                else if(a<=31)
                {
                    System.out.print("Ban thuoc cung Bo Cap");
                }
                else
                {
                    System.out.print("Ngay sinh khong hop le");
                }
                break;
            case 11:
                if(a>=1 && a<=22)
                {
                    System.out.print("Ban thuoc cung Bo Cap.");
                }
                else if(a<=30)
                {
                    System.out.print("Ban thuoc cung Nhan Ma");
                }
                else
                {
                    System.out.print("Ngay sinh khong hop le");
                }
                break;
            case 12:
                if(a>=1 && a<=21)
                {
                    System.out.print("Ban thuoc cung Nhan Ma.");
                }
                else if(a<=31)
                {
                    System.out.print("Ban thuoc cung Ma Ket");
                }
                else
                {
                    System.out.print("Ngay sinh khong hop le");
                }
                break;
        }
    }

}
