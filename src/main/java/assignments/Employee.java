package assignments;

public class Employee {

	private String employeeName;
	private double baseSalary;
	private double experience;
	private double yearEndRating;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	public double getYearEndRating() {
		return yearEndRating;
	}
	public void setYearEndRating(double yearEndRating) {
		this.yearEndRating = yearEndRating;
	}
	public Employee(String employeeName, double baseSalary, double experience, double yearEndRating) {
		super();
		this.employeeName = employeeName;
		this.baseSalary = baseSalary;
		this.experience = experience;
		this.yearEndRating = yearEndRating;
	}
	
	
}
