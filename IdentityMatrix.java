package twodimesionalarrays;

import java.util.Scanner;

public class IdentityMatrix {

	public static void main(String[] args) { 
		    Scanner scanner = new Scanner(System.in);
		    System.out.print("Enter no of rows in array: ");
		    int rows = scanner.nextInt();
		    System.out.print("Enter no of columns in array: ");
		    int columns = scanner.nextInt();

		    int[][] arr = new int[rows][columns];
		    System.out.println("Enter elements in array");
		    for (int i = 0; i < rows; i++) {
		      for (int j = 0; j < columns; j++) {
		        arr[i][j] = scanner.nextInt();
		      }
		    }
		    if (isIdentityMatrix(arr, rows, columns)) {
		      System.out.println("The given array is an identity matrix.");
		    } else {
		      System.out.println("The given array is not an identity matrix.");
		    }
		  }
		  public static boolean isIdentityMatrix(int[][] array, int rows, int columns) {
		    if (array.length != array[0].length) {
		      return false;
		    }
		    for (int i = 0; i < rows; i++) {
		      for (int j = 0; j < columns; j++) {
		        if (i == j && array[i][j] != 1) {
		          return false;
		        }
		        if (i != j && array[i][j] != 0) {
		          return false;
		        }
		      }
		    }
		    return true;
		  }
	}


	


