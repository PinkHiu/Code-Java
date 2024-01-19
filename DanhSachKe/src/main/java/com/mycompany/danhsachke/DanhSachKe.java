/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.danhsachke;
import java.util.*;

public class DanhSachKe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int [n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("List("+(i + 1)+") = ");
            for(int j = 0; j < n; j++)
                if(a[i][j] == 1) 
                    System.out.print(j + 1 + " "); 
            System.out.println();
        }
    }
}
