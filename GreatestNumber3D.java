package array;

public class GreatestNumber3D {public static void main(String args[]){
	int m=0;
	int[][] arr=new int[3][3];
	if(args.length<9){
		System.out.println("Please enter 9 integer numbers");
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
	int com=arr[0][0];

	for(int i=0;i<arr.length;i++){
		 for(int j=0;j<arr.length;j++){
		 if(com<arr[i][j]){
			 com=arr[i][j];
		 }
		}
	}

	System.out.println("The Biggest element in the array is:"+com);
}
}

