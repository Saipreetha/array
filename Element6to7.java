package array;

import java.util.Scanner;

public class Element6to7 {
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
		int sum=0;
		int sum1=0;
		int a=0;
		int b=0;
      for(int i=0;i<arr.length;i++){
    	 
    		  if(arr[i]==6){
    			a=i;  
    		  }
    		   if(arr[i]==7){
    			  b=i;
    		  }
    		 
      }  
      if(a<b){
      for(int j=0;j<a;j++){
     	sum1=sum1+arr[j];  
		  }
	  for(int k=arr.length-1;k>b;k--){
		  sum=sum+arr[k];
	  }
      System.out.print(+sum+sum1);
      }
      else{
    	  for(int l=0;l<arr.length;l++){
    	     sum=sum+arr[l];
      }
    	  System.out.print(+sum);  
}
}
}