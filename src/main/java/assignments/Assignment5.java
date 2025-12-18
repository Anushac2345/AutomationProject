package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5 {

	public static void main(String[] args) {

		// Student1 details are stored using HashMap
		Map<String,String> student1 = new HashMap<String,String>();
		student1.put("Name", "Jhon Doe");
		student1.put("Age", "20");
		student1.put("Gender", "Male");
		student1.put("Roll Number", "SBA12345");
		student1.put("Grade", "A++");
		student1.put("Major", "Computer");
		student1.put("GPA", "A3.8");
		student1.put("Email", "john@example.com");
		student1.put("PAN Number", "SDF6543210");
		student1.put("Address", "123 Elm St");
		System.out.println("Student 1 details :" + student1);
		
		//student 2 details are stored by using HashMap
		Map<String, String> student2 = new HashMap<String, String>();
		student2.put("Name", "Jane Smith");
		student2.put("Age", "21");
		student2.put("Gender", "Female");
		student2.put("Roll Number", "SBA12346");
		student2.put("Grade", "B+");
		student2.put("Major", "Mathematics");
		student2.put("GPA", "A3.5");
		student2.put("Email", "jane@example.com");
		student2.put("PAN Number", "REW6543211");
		student2.put("Address", "456 Oak St");
		System.out.println("Student 2 details :" + student2);
		
		//Student 3 details are stored using HashMap

				Map<String, String> student3 = new HashMap<String, String>();
				student3.put("Name", "Mike Brown");
				student3.put("Age", "22");
				student3.put("Gender", "Male");
				student3.put("Roll Number", "SBA12347");
				student3.put("Grade", "A+");
				student3.put("Major", "Physics");
				student3.put("GPA", "A3.9");
				student3.put("Email", "mike@example.com");
				student3.put("PAN Number", "TYR6543212");
				student3.put("Address", "789 Pine St");
				System.out.println("Student 3 details :" + student3);
				
				// Student1,Student2,Student3 details are adding by List 

				List<Map<String, String>> studentList = new ArrayList<Map<String, String>>();
				studentList.add(student1);
				studentList.add(student2);
				studentList.add(student3);
				System.out.println("Student List :" + studentList);
				
	// Employee 1 details are storing by using HashMap

				Map<String, String> employee1 = new HashMap<String, String>();
				employee1.put("Employee ID", "E001");
				employee1.put("Name", "Alice Green");
				employee1.put("Age", "30");
				employee1.put("Gender", "Female");
				employee1.put("Department", "Engineering");
				employee1.put("Position", "Software Engineer");
				employee1.put("Salary", "75,000");
				employee1.put("Email", "alice@example.com");
				employee1.put("PAN Number", "SDF6543210");
				System.out.println("Employee 1 details :" + employee1);
				
		// Employee 2 details are storing by using HashMap

				Map<String, String> employee2 = new HashMap<String, String>();
				employee2.put("Employee ID", "E002");
				employee2.put("Name", "Bob Johnson");
				employee2.put("Age", "35");
				employee2.put("Gender", "Male");
				employee2.put("Department", "Marketing");
				employee2.put("Position", "Marketing Manager");
				employee2.put("Salary", "85,000");
				employee2.put("Email", "bob@example.com");
				employee2.put("PAN Number", "REW6543211");
				System.out.println("Employee 2 details :" + employee2);

	// Employee3 details are stored using Map(HashMap)

				Map<String, String> employee3 = new HashMap<String, String>();
				employee3.put("Employee ID", "E003");
				employee3.put("Name", "Carol White");
				employee3.put("Age", "28");
				employee3.put("Gender", "Female");
				employee3.put("Department", "Sales");
				employee3.put("Position", "Sales Executive");
				employee3.put("Salary", "65,000");
				employee3.put("Email", "carol@example.com");
				employee3.put("PAN Number", "TYR6543212");
				System.out.println("Employee 3 details :" + employee3);
				
	// Employee1,Employee2,Employee3 details are added by List

				List<Map<String, String>> employeeList = new ArrayList<Map<String, String>>();
				employeeList.add(employee1);
				employeeList.add(employee2);
				employeeList.add(employee3);
				System.out.println("Employee List :" + employeeList);
				
	// Product1 details are storing by  using HashMap

				Map<String, String> product1 = new HashMap<String, String>();
				product1.put("Product ID", "P001");
				product1.put("Name", "Laptop");
				product1.put("Category", "Electronics");
				product1.put("Price", "$1,200");
				product1.put("Stock Quantity", "Not available");
				product1.put("Supplier", "Tech Supplies");
				product1.put("Warranty", "2 years");
				product1.put("Rating", "4.5");
				product1.put("Manufacturing Date", "Aug 2023");
				product1.put("Expiry Date", "Aug 2028");
				System.out.println("Product 1 details :" + product1);

				// Below product2 details are stored using Map(HashMap)

				Map<String, String> product2 = new HashMap<String, String>();
				product2.put("Product ID", "P002");
				product2.put("Name", "Desk Chair");
				product2.put("Category", "Furniture");
				product2.put("Price", "$150k");
				product2.put("Stock Quantity", "2");
				product2.put("Supplier", "Office Depot");
				product2.put("Warranty", "1 year");
				product2.put("Rating", "4");
				product2.put("Manufacturing Date", "Sept 2024");
				product2.put("Expiry Date", "N/A");
				System.out.println("Product 2 details :" + product2);

				// Below product3 details are stored using Map(HashMap)

				Map<String, String> product3 = new HashMap<String, String>();
				product3.put("Product ID", "P003");
				product3.put("Name", "Coffee Maker");
				product3.put("Category", "Kitchen");
				product3.put("Price", "$75");
				product3.put("Stock Quantity", "200");
				product3.put("Supplier", "KitchenWorld");
				product3.put("Warranty", "6 months");
				product3.put("Rating", "4.2");
				product3.put("Manufacturing Date", "Jan 2025");
				product3.put("Expiry Date", "Jan 2027");
				System.out.println("Product 3 details :" + product3);

	// Product1,Product2,Product3 details are adding by List

				List<Map<String, String>> productList = new ArrayList<Map<String, String>>();
				productList.add(product1);
				productList.add(product2);
				productList.add(product3);
				System.out.println("Product List :" + productList);

	// Accessing all the data of studentList,employeeList,productList are mapped by using HashMap

				Map<String, List<Map<String, String>>> data = new HashMap<String, List<Map<String, String>>>();
				data.put("StudentData", studentList);
				data.put("EmployeeData", employeeList);
				data.put("ProductData", productList);
				System.out.println("All Data List :" + data);
				
				System.out.println("Supplier Name from ProductData: "+ data.get("ProductData").get(1).get("Supplier"));
			}

	}


