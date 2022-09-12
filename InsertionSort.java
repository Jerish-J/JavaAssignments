public class InsertionSort {
	
	void sortArr(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int current = arr[i];
			int j = i - 1;
            
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = current;
		}
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String args[])
	{
		int arr[] = {6, 19, 1, 7, 4, 3, 2, 8};

		InsertionSort arrayOfNumbers = new InsertionSort();
		arrayOfNumbers.sortArr(arr);

		printArray(arr);
        
	}
} 