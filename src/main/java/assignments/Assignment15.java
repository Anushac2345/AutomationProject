package assignments;

public class Assignment15 {

	public static void main(String[] args) {
		//Count the total number of words in the sentence.
		String str = "Java programming is fun and challenging";
		String[] values = str.split(" ");
		for (String value : values) {
			System.out.println(value);
		}

		//Print the sentence words in reverse order.
		for (int i = values.length - 1; i >= 0; i--) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
		
		//Convert the first character of each word to uppercase and print original sentence
		for (String value : values) {
			String newString = value.substring(0, 1).toUpperCase() + value.substring(1, value.length());
			System.out.print(newString + " ");
		}
	}

}
