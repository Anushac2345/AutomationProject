package assignments;

public class Assignment6 {
	
	public static void main(String[] args)
	{
		String[] studentNames = {"Suresh", "Mahesh", "Naresh"};
		int[] studentMarks = {75,80,82};
		studentMarks[0] += 10;
		studentMarks[1] += 10;
		studentMarks[2] += 10;
		
		System.out.println("Updated Marks:");
		int studentsTotalMarks = 0;
		for(int i=0;i<studentNames.length; i++)
		{
			System.out.println(studentNames[i] + ": "+ studentMarks[i]);
			studentsTotalMarks +=studentMarks[i];
		}
		
		System.out.println("Average Marks: "+ (double)(studentsTotalMarks/studentMarks.length));
			
	}

}
