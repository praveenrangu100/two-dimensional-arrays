package twodimesionalarrays;

import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		  System.out.println("enter the number of rows"); 
		  int rows = sc.nextInt(); 
		  System.out.println("enter the number of columns"); 
		  int columns = sc.nextInt(); 
		  int arr1[][] = new int [rows][columns]; 
		  System.out.println("enter the elements of matrix"); 
		  for (int i=0;i<rows;i++) { 
		   for (int j=0;j<columns;j++)  
		    arr1[i][j] = sc.nextInt();
		  		}  
		  int[] rowSums = getRowSums(arr1,rows,columns);
			System.out.println("The sum of each row is:");
			for (int sum : rowSums) {
			  System.out.println(sum);
			}
		}
	public static int[] getRowSums(int[][] arr1, int rows, int columns) {
			int[] rowSums = new int[rows];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					rowSums[i] += arr1[i][j];
			}
			}
			return rowSums;
	}
		
}
	


	

