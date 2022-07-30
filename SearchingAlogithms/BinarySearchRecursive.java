package SearchingAlogithms;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int numArray[] = { 5, 10, 15, 20, 25, 30, 35 };        
         
        int key = 20;        
        int first = 0;
        int last = numArray.length - 1;                
        
        int index = binarySearch(numArray, key, first, last);
        
        if (index == -1) System.out.println("Element is not found!");
        else System.out.println("Element is found at index: " + index);
    }
    public static int binarySearch(int[] numArray, int key, int first, int last) {
        if (first > last) return -1;
        
        int mid = (first + last) / 2;
        
        if (numArray[mid] == key) return mid;
        else if (numArray[mid] < key) return binarySearch(numArray, key, mid + 1, last);
        else return binarySearch(numArray, key, first, mid - 1);
    }
}


