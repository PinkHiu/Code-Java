/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.danhsachdoanhnghiep;
import java.util.*;
import java.io.*;

public class DanhSachDoanhNghiep 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList <DoanhNghiep> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            DoanhNghiep tmp = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(DoanhNghiep x : ds) System.out.println(x);
    }
}
