package array;
import java.util.Scanner;
import java.util.Arrays;
public class DuplicateElement {
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
		for(int i=0;i<num-1;i++){
			if(arr[i]!=arr[i+1]){
								System.out.println(arr[i]);
			}
		}
		System.out.println(arr[num-1]);
	}
}
