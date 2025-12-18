package language.basics;

public class EmpGroups {

	public static void main(String[] args)
	{
		String[] employeeNames = new String[3];
		 int[] employeeIds = new int[3];
		 
		 Employees employees = new Employees();
		 employeeNames[0] = employees.empName1;
		 employeeIds[0] = employees.empId1;
		 employeeNames[1] = employees.empName2;
		 employeeIds[1] = employees.empId2;
		 employeeNames[2] = employees.empName3;
		 employeeIds[2] = employees.empId3;
		 
		 System.out.println("Employee Name: "+ employeeNames[0]+", Employee ID: "+ employeeIds[0]);
		 System.out.println("Employee Name: "+ employeeNames[1]+", Employee ID: "+ employeeIds[1]);
		 System.out.println("Employee Name: "+ employeeNames[2]+", Employee ID: "+ employeeIds[2]);

	}
	 
	 
	 

}
