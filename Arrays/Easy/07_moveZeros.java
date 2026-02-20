class solution{
	
	public static int[] moveZeros(int arr[],int n){
		// Approach 1: Brute Force:
		// TC: O(n) SC: O(n)
		
		// Step 1: create a temp array to store the result:
		int temp[] = new int [n];
		
		// Step 2: intialize a pointer to track the temp array:
		int idx = 0;
		
		// Step 3: traverse throught whole array:
		for(int i=0;i<n;i++){
			// Step 4: if curr element is non-zero then add it to temp array:
			if(arr[i]!=0){
				temp[idx]=arr[i];
				// Step 5: move the pointer of temp array by one:
				idx++;
			}
		}
		
		for(int nums:temp){
			System.out.print(nums+" ");
		}
		
		
	}
	
	public static void moveZerosOptimized(int arr[],int n){
		
		int i = 0;
		
		for(int j=0;j<n;j++){
			if(arr[j]!=0){
				int temp = arr[j];
				arr[j]=arr[i];
				arr[i]= temp;
				i++;
			
			}
		}
		for(int i=0;i<n;i++){
			if(arr[i]==0){

			}
		}
		
		for(int nums:arr){
			System.out.print(nums+" ");
		}
	}
	
	public static void main(String[] args){
		int arr[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
		int n = arr.length;
		
		// Function call:
		moveZeros(arr,n);
		moveZerosOptimized(arr,n);
	}
}
