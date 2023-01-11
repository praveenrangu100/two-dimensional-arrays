package twodimesionalarrays;

import java.util.Scanner;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows =sc.nextInt();
		System.out.println("Enter no of columns");
		int columns = sc.nextInt();
		int[][] arr= new int[rows][columns];
		System.out.println("Enter the elements in array");
		
		for (int i = 0;i<rows;i++)
			for(int j=0;j<columns;j++)
				arr[i][j]=sc.nextInt();
		for (int i = 0;i<rows;i++) {
			for(int j=0;j<columns;j++)
				System.out.print(arr[i][j]+" ");
		System.out.println();
		}
	}

}
