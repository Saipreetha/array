package array;
import java.util.Scanner;
import java.util.Arrays;
public class RepeatMaximum {
	public static void main(String args[]){
		int num;
		
		System.out.print("Enter the number of elements in array");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		int arr[]=new int [num];
		System.out.print("Enter the elements in array");
		int max=0;
		int maxNum=0;
		for(int i=0;i<num;i++){
			arr[i]=scan.nextInt();
		}
		scan.close();
		Arrays.sort(arr);
		int count;
		for(int i=0;i<num;i++){
			count=1;
			for(int j=i+1;j<num;j++){
			if(arr[i]==arr[i+1]){
				count++;
			}
			if(count>max){
				max=count;
				maxNum=arr[j];
			}
		}
}
		System.out.print(maxNum);
	}
}
