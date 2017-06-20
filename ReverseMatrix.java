package array;

public class ReverseMatrix {
	public static void main(String args[]){
		int m=0;
		int[][] arr=new int[2][2];
		if(args.length<=3){
			System.out.println("Please enter 4 integer numbers");
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[i][j]=Integer.parseInt(args[m]);
				m++;
			}
		}
		System.out.println("The given array is:");
		for(int i=0;i<arr.length;i++){
			 for(int j=0;j<arr.length;j++){
				 System.out.print(arr[i][j]+" ");
				}
			 System.out.println();
			}
	System.out.println("The reverse array is:");
		for(int i=arr.length-1;i>=0;i--){
		 for(int j=arr.length-1;j>=0;j--){
			 System.out.print(arr[i][j]+" ");
			}
		 System.out.println();
		}


	}
}