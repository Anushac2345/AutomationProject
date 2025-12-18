package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment4 {
	public static void main(String[] args) { 
		
	//	Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
	//	cities combined.
		
		List<Integer> cityAreas = new ArrayList<>();
		cityAreas.add(4200); //city 1
		cityAreas.add(3900); //city 2
		cityAreas.add(3500); //city 3
		cityAreas.add(3000); //city 4
		cityAreas.add(2800); //city 5
		
		int total = cityAreas.get(2) + cityAreas.get(3);
		System.out.println("Total areas of 3rd and 4th cities = " + total);
		
	/*	Create a set of the top 10 most visited tourist attractions in the world and print out all
		of them and its size.  */
		
		Set<String> attractions = new HashSet<>();
		attractions.add("Tirupati"); //1st attraction
		attractions.add("Niagara falls"); //2nd attraction
		attractions.add("Eiffel Tower"); //3rd attraction
		attractions.add("Washigton DC"); //4th attraction
		attractions.add("Taj Mahal"); //5th attraction
		attractions.add("Newyork");  //6th attraction
		attractions.add("Time Square"); //7th attraction
		attractions.add("London Bridge"); //8th attraction
		attractions.add("Yellow stone"); //9th attraction
		attractions.add("Disney World"); //10th attraction
		System.out.println(attractions);
		System.out.println("Top most visited tourist attractions = " + attractions.size());
		
	//Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
	//	6th Value.
		
	    int[] numbers = {5,10,15,20,25,30,35,40,45,50};
	    int avg =(numbers[4]+numbers[5])/2;
	    System.out.println("Average of 5th and 6th Value of numbers = " +avg);
	    
	 //   Create a list of the top 5 highest-grossing movies of all time and print out the third
	//    movie on the list.
	    
	    List<String> movies = new ArrayList<>();
	    movies.add("Kantara");
	    movies.add("Bahubali");
	    movies.add("Titanic");
	    movies.add("Mirai");
	    movies.add("Avatar");
	   
	    System.out.println("The 3rd highest grossing movie = " + movies.get(2) );
		
	
	}
}
