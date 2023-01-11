package twodimesionalarrays;

import java.util.Scanner;

public class AdditionOfMatrix {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in); 
		  System.out.println("enter the number of rows"); 
		  int rows = sc.nextInt(); 
		  System.out.println("enter the number of columns"); 
		  int columns = sc.nextInt(); 
		  int arr1[][] = new int [rows][columns]; 
		  System.out.println("enter the elements of matrix 1"); 
		  for (int i=0;i<rows;i++) { 
		   for (int j=0;j<columns;j++)  
		    arr1[i][j] = sc.nextInt(); 
		     
		   } 
		  int arr2[][] = new int[rows][columns]; 
		  System.out.println("enter the elements of matrix 2"); 
		  for (int i=0;i<rows;i++) { 
		   for (int j=0;j<columns;j++) 
		    arr2[i][j] = sc.nextInt(); 
		 } 
		    addTwoMatrix(arr1,arr2,rows,columns); 
		 } 
		 public static void addTwoMatrix(int[][] arr1 ,int[][] arr2 ,int rows, int columns) { 
		  int sum [][] = new int [rows][columns]; 
		  System.out.println("the sum of matrix is :"); 
		  for (int i =0;i<rows;i++) { 
		   for(int j=0;j<columns;j++) { 
		    sum[i][j] = arr1[i][j]+arr2[i][j]; 
		    System.out.print(sum[i][j] + " "); 
		   }System.out.println(); 
		  } 
		   } 
		 }
	/*public static void addMatrix(int[][] arr1,int[][] arr2) {
		int j = 0,i = 0;
		int[][] arr3=;
		for (i = 0;i<arr1.length;i++)
			for(j=0;j<arr2.length;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.println(arr3[i][j]);	
			}*/

