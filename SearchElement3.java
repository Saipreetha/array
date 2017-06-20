package array;
import java.util.Scanner;
public class SearchElement3 {
	public static void main(String args[]){
		int count=0;
		int arr[]=new int[]{10,5,89,90};
		System.out.println("Enter the number to check:");
		Scanner scan=new Scanner(System.in);
		int check=scan.nextInt();
		for(int i=0;i<arr.length;i++){
			if(check==arr[i]){
				System.out.print(+i);
				count++;
			}
		}
		
		if(count==0){
			System.out.print(-1);	
		}
		
	
		        scan.close();
		}
	        
		}


