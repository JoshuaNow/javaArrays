package javaArrays;

public class loopThatPopulates {

	public static void main(String[] args) {
	

	
	int[] array = new int[10];
	
	for(int x = 0; x < array.length ; x++) {
		array[x] = x + 1;
		System.out.println(array[x] + " ");
		
	};

	for(int x = 0; x < array.length ; x++) {
		array[x] = x * 15; // or this array[x] = array[x] * 15;
		System.out.println(array[x] + " ");
		
	};
	
//	for(int handle: array) {
//		System.out.println(handle + "\n");
//	}
	
}

}
