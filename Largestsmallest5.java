package array;
import java.util.Scanner;
import java.util.Arrays;
public class Largestsmallest5 {
	public static void main(String args[]){
		int num;
		System.out.print("Enter the number of elements in array");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		int arr[]=new int [num];
		System.out.print("Enter the elements in array");
		for(int i=0;i<num;i++){
			arr[i]=scan.nextInt();
		}
		scan.close();
		Arrays.sort(arr);
		System.out.println("Minimum 1:"+arr[0]);
		System.out.println("Minimum 2:"+arr[1]);
		System.out.println("Maximum 1:"+arr[num-1]);
		System.out.println("Maximum 2:"+arr[num-2]);
				
		}
	}


