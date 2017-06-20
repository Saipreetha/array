package array;

public class CharcterAscii {
	public static void main(String args[]){
		int arr[]=new int[]{65,78,90,35,36};
		for(int i=0;i<=arr.length;i++){
            System.out.format("%1$-2c", (char) arr[i]);
		}
	}

}

