
public class arrayRowColumnZero {
	public static void main(String args[]){
		
		int x_dim = 6;
		int y_dim = 9;
		int arr[][] = new int [x_dim][y_dim];
		for(int i = 0; i < x_dim; i++){
			for(int j = 0; j < y_dim; j++){
				arr[i][j] = 2*i-3*j+1;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		zeroMatrix(arr, x_dim, y_dim);
		System.out.println();
		
		for(int i = 0; i < x_dim; i++){
			for(int j = 0; j < y_dim; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void zeroMatrix(int arr[][], int m, int n){
		char array_x[] = new char [m];
		char array_y[] = new char [n];
		
		for(int i = 0 ; i < m; i++){
			for(int j = 0; j < n; j++){
				if(arr[i][j] == 0){
					array_x[i]++;
					array_y[j]++;
				}
			}
		}
		
		for(int i = 0; i < m; i++){
			if(array_x[i] != 0){
				for(int j = 0; j < n; j++){
					arr[i][j] = 0;
				}
			}
		}
		
		for(int j = 0; j < n; j++){
			if(array_y[j] != 0){
				for(int i = 0; i < m; i++){
					arr[i][j] = 0;
				}
			}
		}
	}
}
