package array;
import java.util.Scanner;
public class MinimumMax {
	
	
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
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<num;i++){
			if(min>arr[i]){
				min=arr[i];
			}
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println("Minimum value:"+min);
		System.out.println("Maximum value:"+max);
}
}

