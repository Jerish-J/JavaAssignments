class BinarySeachTechnique {
    public static void search(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last){
            if (arr[mid] < key){
                first = mid + 1;
            }
            else if (arr[mid] == key){
                System.out.println("Element found in position " + mid);
                break;
            }
            else {
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if (first > last){
            System.out.println("Element is not in the given array");
        }
    }
    public static void main(String args[]){
        int arr[] = {5, 10, 15, 20, 25, 30};
        int key = 20;
        int last = arr.length - 1;
        search(arr, 0, last, key);
    }
}