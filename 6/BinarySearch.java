/**
 * Binary Search
 * Partners: Ziang Li, Shiguo Feng
 */

public class BinarySearch{
	public static void main (){
		return;
	}

	public int find(int key, int[] arr){

		int size = arr.length;
		int first = 0;
		int last = size - 1; 
		int mid = (first + last) / 2;
		int index = -1;

		while(first <= last){
			if (arr[mid] < key){
				first = mid + 1;
			}
			else if(arr[mid] == key){
				index = mid;
				return index;
			}
			else{
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		

		if (first > last){
			index = -1;
			return index;
		}
		return -1;
	}
}
