/**
 * the method to test the binary search
 * Partners: Ziang Li, Shiguo Feng
 */
public class BinarySearchTest{
	// The main method
	public static void main(String[] args){
		int[] myNum = {1, 2, 3, 4, 5, 6, 7};
		int search_1 = 1;
		int search_2 = 2;
		int search_3 = 10;
		System.out.println("The list is: ");
		for (int i = 0; i < myNum.length; i++){
			System.out.println(myNum[i]);
		}

		BinarySearch search = new BinarySearch();
		System.out.println("Searching for: "+ search_1);
		int result = search.find(search_1, myNum);
		if (result == -1){
			System.out.println("The number search does not exist");
		}
		else{
			System.out.println("The key index is at " + result);
		}
		
		System.out.println("Searching for: "+ search_2);
		result = search.find(search_2, myNum);
		if (result == -1){
			System.out.println("The number search does not exist");
		}
		else{
			System.out.println("The key index is at " + result);
		}

		System.out.println("Searching for: "+ search_3);
		result = search.find(search_3, myNum);
		if (result == -1){
			System.out.println("The number search does not exist");
		}
		else{
			System.out.println("The key index is at " + result);
		}



	}


}
