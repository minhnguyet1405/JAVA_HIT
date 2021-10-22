/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class RunMain {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n = ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int k, vt1, vt2;

        int m;
        do {
            System.out.print("nhap lua chon : ");
            m = sc.nextInt();
            switch (m) {
                case 1:
                    input(a, n);
                    break;
                case 2:
                    System.out.println("Mang vua nhap la : ");
                    output(a, n);
                    break;
                case 3:
                    System.out.println("Nhap phan tu can chen : ");
                    k = sc.nextInt();
                    System.out.println("Nhap vi tri can chen : ");
                    vt1 = sc.nextInt();
                    chen(a, n, k, vt1);
                   
                    break;
                case 4:
                    System.out.println("Nhap vi tri can xoa ");
                    vt2 = sc.nextInt();
                    xoa(a, n, vt2);
                    System.out.println("Mang sau khi xoa la : ");
                    n--;
                    output(a, n);
                    break;
                case 5:
                    hienthi(a, n);                  
                    break;
                case 6:
                    hienThiPhanTu(a, n);
                    break;
                case 7:
                    tongNT(a, n);
                    break;
                case 8:
                    return;
                default:
                    System.out.println("khong hop le ");
            }
        } while (m != 8);

    }

    public static void input(int[] a, int n) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Moi nhap mang : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }

    public static void output(int[] a, int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public static void chen(int[] a, int n, int k, int vt) {
        Scanner sc = new Scanner(System.in);
        n++;
        int[] b = new int[n];
        for (int i = 0; i < n - 1; i++) {
            b[i] = a[i];
        }
        for (int i = n - 1; i >= vt; i--) {
            b[i] = b[i - 1];
        }
        b[vt - 1] = k;

        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = b[i];
        }
        System.out.println("Mang sau khi chen la : ");
        output(a, n);
    }

    public static void xoa(int[] a, int n, int vt) {
        
        for (int i = vt - 1; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        n--;
        
    }

    public static void hienthi(int[] a, int n) {
        for(int i=0;i<n/2;i++)
        {
            int temp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=temp;
        }
        System.out.println("Mang dao nguoc la : ");
        for (int i =0;i<n;i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public static void hienThiPhanTu(int[] a, int n) {
        System.out.println("a[1]=" + a[1]);
        System.out.print("Phan tu chia het cho a[1] la :");
        for (int i = 0; i < n; i++) {
            if (a[i] % a[1] == 0 && i != 1) {
                System.out.print(a[i] + " ");

            }
        }

        System.out.println("");
    }

    public static boolean prime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void tongNT(int[] a, int n) {
        int sum = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (prime(a[i])) {
                sum += a[i];
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println("khong co so nguyen to nao trong mang");
        } else {
            System.out.println("Tong cac so nguyen to = " + sum);
        }

    }

}
