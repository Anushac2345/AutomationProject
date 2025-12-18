package language.basics;

public class Assignment2 {

	public static void main(String[] args) {

		//3d array =[subjects][marks][values]
		
	String[][][] data ={
			{	//sem-1
				{"MathematicsI","physics","chemistry","computer programming", "Engineering", "Basic electrical engineering"},
		{"pass(78)","pass(85)","Fail(21)","pass(74)","pass(88)","pass(79)"}},
		
		{//sem-2
			{"MathmaticsII","Mechanics","Enviromental science","Basic electronics","engineering physics","engineering graphics"},
			{"pass(82)","pass(77)","pass(93)","Fail(19)","Fail(24)","pass(90)"}	
		},
		{//sem-3
			{"Data Structures","Discrete Mathematics","Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog."},
			{"Pass(88)", "Pass(81)", "Pass(76)", "Fail(32)", "Pass(85)", "Pass(78)"}
		},
		{//sem-4
			{"Algorithms", "Computer Networks", "Database Systems", "Microprocessors", "Communication Eng", "Software Engineering"},
			{"Pass(91)", "Pass(73)", "Fail(19)", "Pass(80)", "Pass(76)", "Pass(87)"}
		},
		{// sem-5
			{"Probability & Stats","Machine Learning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics"},
			{"Pass(86)", "Pass(88)", "Pass(84)", "Pass(95)", "Pass(73)", "Pass(90)"}
		}	
		
	};
	
	System.out.println("Sem-2 subject-4  : "+ data[1][0][3]); //
	System.out.println("Sem-2  subject-5 : "+ data[1][0][4]);
	System.out.println("Sem-4  subject-3 : "+ data[3][0][2]);
	System.out.println("Sem-2  subject-5 : "+ data[3][0][5]);
}
}
