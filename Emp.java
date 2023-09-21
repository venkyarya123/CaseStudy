
public class Emp {
	int empId;
	String empName;
	String designation;
	String City;
	int salary;
	
	public Emp() {
		super();
	}

	public Emp(int empId, String empName, String designation, String city, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		City = city;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", City=" + City
				+ ", salary=" + salary + "]";
	}
	
	
	
}
