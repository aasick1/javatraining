import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lets declare some arrays
		byte byteArr[] = {10, 20, 15, 22, 35};
		char charArr[] = {'a', 'e', 'i', 'o', 'u'};
		int intArr[] = {3, 5, 10, 45, 80};
		double doubleArr[] = {10.3, 16.43, 45.30};
		float floatArr[] = {10.2f, 15.1f, 2.2f, 3.5f};
		short shortArr[] = {10, 20, 15, 22, 35};
		
		//by using sort90 methods array items will sort
		Arrays.sort(byteArr);
		Arrays.sort(charArr);
		Arrays.sort(intArr);
		Arrays.sort(doubleArr);
		Arrays.sort(floatArr);
		Arrays.sort(shortArr);
		
		//defining the search items
		byte byteKey = 35;
		char charKey = 'b';
		int intKey = 80;
		double doubleKey = 3.34;
		float floatKey = 3.5f;
		short shortKey = 35;
		
		//printing array binarysearch result
		System.out.println(byteKey + " found at index = " + Arrays.binarySearch(byteArr, byteKey));
		System.out.println(charKey + " found at index = " + Arrays.binarySearch(charArr, charKey));
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));
		System.out.println(doubleKey + " found at index = " + Arrays.binarySearch(doubleArr, doubleKey));
		System.out.println(floatKey + " found at index = " + Arrays.binarySearch(floatArr, floatKey));
		System.out.println(shortKey + " found at index = " + Arrays.binarySearch(shortArr, shortKey));

		
		System.out.println("Integer Array: " + Arrays.toString(intArr));
	}

}
