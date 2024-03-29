/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.capsocotongbangk;
import java.util.*;

public class CapSoCoTongBangK 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            int n = sc.nextInt();
            long k = sc.nextLong(), a[] = new long [n];
            for(int i = 0; i < n; i++) a[i] = sc.nextLong();
            System.out.println(countPair(a, k));
        }
    }
    
    public static long countPair(long [] a, long k)
    {
        long count = 0;
        HashMap <Long, Long> hm = new HashMap<>();
        for(int i = 0; i < a.length; i++)
        {
            if(!hm.containsKey(a[i])) hm.put(a[i], (long)1);
            else hm.put(a[i], hm.get(a[i]) + 1);
        }
        for(int i = 0; i < a.length; i++)
        {
            if(hm.get(k - a[i]) != null) count += hm.get(k - a[i]);
            if(k - a[i] == a[i]) count--;
        }
        return count / 2;
    }
}
