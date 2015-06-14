
public class arrayRotateMatrix {
	public static void main(String args[]){
		int arraySize = 8;
		
		int arr[][] = new int [arraySize][arraySize];
		for(int i = 0; i < arraySize; i++){
			for(int j = 0; j < arraySize; j++){
				arr[i][j] = i * j + i;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		rotate(arr, arraySize);
		System.out.println();
		
		for(int i = 0; i < arraySize; i++){
			for(int j = 0; j < arraySize; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void rotate(int arr[][], int size){
		int buf, iSize, jSize;
		int rs = size-1;
		if(size%2 == 1){
			iSize = size/2 + 1;
			jSize = size/2;
		}else{
			iSize = size/2;
			jSize = size/2;
		}
		
		for(int i = 0; i < iSize; i++){
			for(int j = 0; j < jSize; j++){
				buf = arr[i][j];
				arr[i][j] = arr[j][rs-i];
				arr[j][rs-i] = arr[rs-i][rs-j];
				arr[rs-i][rs-j] = arr[rs-j][i];
				arr[rs-j][i] = buf;
			}
		}
		
	}
}
