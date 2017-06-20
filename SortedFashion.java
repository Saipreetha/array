package array;
import java.util.Arrays;
import java.util.Scanner;
public class SortedFashion {
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
      for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
}
}