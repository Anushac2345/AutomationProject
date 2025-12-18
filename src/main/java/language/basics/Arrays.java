package language.basics;

public class Arrays {

	public static void main(String[] args) {

   /* 3D Array: [Semester][Subject][0=Name,1=Marks]
  
              Semester 1:
           Subject-1 :"Mathematics", "Pass(72)",
           subject-2 :"Physics", "Pass(82)",
           subject-3 :"Chemistry", "Fail(21)",
           subject-4 :"Computer Programming", "Pass(74)",
           subject-5 :"Engineering Drawing", "Pass(88)",
           subject-6 :"Basic Electrical Eng.", "Pass(79)"
           
           Semester 2:
              Subject-1: "Mathematics II", "Pass(77)",
              subject-2 :"Mechanics", "Pass(73)",
              subject-3 :"Environmental Sci.", "Pass(93)",
              subject-4 : "Basic Electronics", "Fail(19)",
              subject-5 : "Engineering Physics", "Fail(24)",
              subject-6 : "Engineering Graphics", "Pass(69)"
           
            Semester 3
                 Subject-1:"Digital Electronics", "Pass(82)",
                 subject-2 :"Electronics Devices", "Pass(76)",
                 subject-3 : "Operating Systems", "Fail(32)",
                 subject-4 :"Engineering Maths", "Pass(84)",
                 subject-5 : "Signals and Systems", "Pass(85)",
                 subject-6 :"Object-Oriented Prog.", "Pass(78)"
           
            Semester 4
                   Subject-1:"Algorithms", "Pass(88)",
                   subject-2 :"Computer Architecture", "Pass(81)",
                   subject-3 :"Microprocessors", "Pass(67)",
                   subject-4 : "Communication Eng", "Pass(76)",
                   subject-5 :"Database Systems", "Pass(73)",
                   subject-6 :"Software Engineering", "Pass(87)"
           
            Semester 5
                    Subject-1:"Artificial Intelligence", "Pass(91)",
                    subject-2 :"Computer Networks", "Pass(73)",
                    subject-3 :"Compiler Design", "Fail(19)",
                    subject-4 :"Theory of Computation", "Pass(80)",
                    subject-5 :"Embedded Systems", "Pass(79)",
                    subject-6 :"Computer Graphics", "Pass(90)" 
                    
             */
           
           String[][][] data = new String[5][6][2];
   // ✅ Print Semester-2 Subject-4 and Subject-5 names
           data[1][3][0] = " Basic Electronics" ;
           data[1][4][0] ="Engineering Physics";
   System.out.println("Semester 2 - Subject 4 Name: " + data[1][3][0]);
   System.out.println("Semester 2 - Subject 5 Name: " + data[1][4][0]);

   // ✅ Print Status/Marks of Semester 4 Subject 3 and Subject 6
   			data[3][2][1] = "Pass(67)";
   			data[3][5][1] ="Pass(87)";
   System.out.println("Semester 4 - Subject 3 Marks: " + data[3][2][1]);
   System.out.println("Semester 4 - Subject 6 Marks: " + data[3][5][1]);
}
}


