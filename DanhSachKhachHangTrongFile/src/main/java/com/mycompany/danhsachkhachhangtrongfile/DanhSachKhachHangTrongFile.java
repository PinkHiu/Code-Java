/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.danhsachkhachhangtrongfile;
import java.util.*;
import java.io.*;
import java.text.*;

public class DanhSachKhachHangTrongFile
{
    public static void main(String[] args) throws FileNotFoundException, ParseException
    {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList <KhachHang> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++)
        {
            KhachHang tmp = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(KhachHang x : ds) System.out.println(x);
    }
}
