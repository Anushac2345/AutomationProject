package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment10 {

	public static void main(String[] args) {
		
		List<Employee> employees =new ArrayList<>();
		Employee employee1 = new Employee("Alice Johnson", 75000.0, 5.1, 4.2);
		Employee employee2 = new Employee("Bob Smith", 68000.0, 3.2, 3.8);
		Employee employee3 = new Employee("Carol Davis", 82000.0, 7.1, 4.5);
		Employee employee4 = new Employee("David Brown", 90000.0, 10.2, 2.5);
		Employee employee5 = new Employee("Eva Green", 60000.0, 2.4, 3.5);
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		
		Map<String,Double> empHikePercentageMap = new HashMap<>();
		for(Employee emp:employees) {
			double variablePay = 0;
			int bonus = 0;
			int extraReward = 0;
			if(emp.getYearEndRating()>=4.0 ){
				variablePay = emp.getBaseSalary() * (15/100);
				bonus = 1500;
			}
			else if(emp.getYearEndRating()>=3 && emp.getYearEndRating()<4) {
				variablePay= emp.getBaseSalary() * (10/100);
				bonus=1200;
			}
			else if(emp.getYearEndRating()<3) {
				variablePay = emp.getBaseSalary() * (3/100);
				bonus =300;
			}
			if(emp.getExperience()>=5) {
				extraReward = 5000;
			}
			double hike = variablePay + bonus + extraReward;
			Double hikePercentage = hike/emp.getBaseSalary();
			empHikePercentageMap.put(emp.getEmployeeName(), hikePercentage);
		}
		
		for(String empName : empHikePercentageMap.keySet()) {
			System.out.println("Employee name: "+ empName +" ," + "Hike percentage: "+empHikePercentageMap.get(empName));
		}
	}

}
