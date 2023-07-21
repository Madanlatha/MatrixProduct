package matrixproduct;

import java.util.Arrays;
import java.util.Scanner;

public class Martix2d {
	public static int[][] matrixproduct(int arr[][],int n,int b){
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=arr[i][j]*b;
			}
		
		}
		return arr;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int b=sc.nextInt();
		int values[][]=matrixproduct(arr,n,b);
		for(int[] value:values) {
			System.out.println(Arrays.toString(value));
		}
		

	}

}
