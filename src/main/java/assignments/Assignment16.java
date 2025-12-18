package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment16 {

	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		
		//Divide into multiple words
		String[] words = paragraph.split(" ");
		int numberOfOccurernces = 0;
		List<Integer> indexesOfTheWord = new ArrayList<>();
		for(int i=0;i<words.length;i++) {
		System.out.println(words[i]);	
		if(words[i].equals("Java")) {
			numberOfOccurernces++;
			indexesOfTheWord.add(i);
		}
		}
		//print total number of occurrences
		System.out.println("Number of occurrences : " + numberOfOccurernces);
		System.out.println("Indexes of the word: "+indexesOfTheWord);
		
	}

}
