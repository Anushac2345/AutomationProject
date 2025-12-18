package assignments;

public class Assignment9_ArraysAndLoops {

	public static void main(String[] args) {
		int[] array = {12,34,11,36,87,98,93};
		
		//Begin sorting the array in descending order without using a temporary variables
		for(int i=0; i<array.length;i++) {
			  for (int j = i + 1; j < array.length; j++) {

	                // If current element is less than the next one, a swap is needed
	                if (array[i] < array[j]) {

	                    // Let's say array[i] = a and array[j] = b
	                    // Step 1: a = a + b
	                    array[i] = array[i] + array[j];

	                    // Step 2: b = a - b => (a + b) - b = a
	                    array[j] = array[i] - array[j];

	                    // Step 3: a = a - b => (a + b) - a = b
	                    array[i] = array[i] - array[j];	
		}
		
	}

}
		 // Printing the second largest number
        System.out.println("Second largest number is :" + array[1]);

        // Printing the third largest number
        System.out.println("Third largest number is :" + array[2]);
	}
}