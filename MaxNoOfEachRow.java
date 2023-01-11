package twodimesionalarrays;

import java.util.Scanner;

public class MaxNoOfEachRow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows in the array: ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns in the array: ");
		int columns = sc.nextInt();
		System.out.println("Enter the elements array");
		int[][] array = new int[rows][columns];
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < columns; j++) {
	            array[i][j] = sc.nextInt();
	        }
	    }
	    getMaxNoinRow(array,rows,columns);
	}
	public static void getMaxNoinRow(int [][] array,int rows,int columns) {
	    for (int i = 0; i < rows; i++) {
	        int max = array[i][0];
	        for (int j = 0; j < columns; j++) {
	            if (array[i][j] > max) {
	                max = array[i][j];
	            }
	        }
	        System.out.println("The maximum number in row " + (i + 1) + " is: " + max);
	    }
	}

	}

