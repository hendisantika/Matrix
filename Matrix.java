package com.hendi.matrix;

import java.util.Random;
import java.util.Scanner;

/**
 * @author hendi.santika
 */
public class Matrix {

    public static void main(String[] args) {
        Random rdm = new Random();
        
        Scanner a = new Scanner(System.in);
        System.out.print("Input Jumlah Dimensi Matrik : ");
        int n = a.nextInt();
        
        int nilaiRandom;
        int matrix[][] = new int[n][n];                          //ukuran matrix  
        //input matrix 
        System.out.println("Matrix " + n + " x " + n +"\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nilaiRandom = rdm.nextInt(2);                 //( ) masukan angka bebas
                matrix[i][j] = nilaiRandom;
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Jumlah pulau : ");
    }
}
