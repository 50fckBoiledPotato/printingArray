/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.iechazi1112;

import java.util.Scanner;

/**
 *
 * @author nagyd
 */
public class IEChazi1112
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        newTask(1);
        printSeparator(60);
        String[] cuss = {"Sorold", "Fel", "A", "Tömb", "Elemeit"};
        printList(cuss);
        
        
        
    }
   
    static void newTask(int task)
    {
        System.out.println("=== " + task + ". feladat ==="  );
        System.out.println();
    }
    
    static void printSeparator(int line){
        
        for(int i = 0; i < line; i++)
        {
            System.out.print("_");           
        }
        System.out.println();
    }
    
    static void printList(String[] array){
        for( int i = 0; i < array.length; i++)
        {
            System.out.println("- " + array[i]);
        }
        System.out.println();
    }
    static void avg(double a, double b){
        System.out.println((a + b)/2); 
    }
    
    
    
    static void arraySearch( int keres, int[] array){
        int index;
        for(int i = 0; i < array.length; i++){
            if(keres == array[i])
            {
                System.out.println("i");
            }
        }
    }
    
    
}


