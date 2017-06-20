package array;

import java.util.Scanner;

public class Initialize1 {
	public static void main(String args[]){
		int num;
		int sum=0;
		System.out.print("Enter the number of elements in array:");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		int arr[]=new int [num];
		System.out.print("Enter all the elements");
		for(int i=0;i<num;i++){
			arr[i]=scan.nextInt();
			sum=sum+arr[i];
		}
		double average=sum/num;
		System.out.print("the sum of the array:"+sum);
		System.out.println("The average of the array:"+average);
        scan.close();	
	}

}
