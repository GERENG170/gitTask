package com.company;
import java.util.Scanner;
public class Main {
  public static void main (String [] args){
      // создание массива
      String [] arr = new String[] {"c","f","d","r"};
      // вывод массива
      for (int i =0;i<arr.length;i++) {
          System.out.print(arr[i]);
      }
      System.out.println();
      int numb = arr.length;
      // замена эелементов в обратном порядке
      String swap;
       for (int i =0;i<numb/2;i++) {
           swap = arr[numb - i - 1];
           arr[numb - i - 1] = arr[i];
           arr[i] = swap;
       }
       // вывод
       for (int i =0;i<arr.length;i++){
           System.out.print(arr[i]);
      }
      }
}





