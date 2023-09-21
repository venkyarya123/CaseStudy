import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmpRepo {
	
	List<Emp> emps = new ArrayList<>();
	
	public void addEmp(Emp emp) {
		emps.add(emp);
	}
	
	public Emp findById(int empId) {
		Optional<Emp> emp = emps.stream().filter( e -> e.getEmpId() == empId ).findAny();
		
		return emp.orElseThrow(() -> new RuntimeException("Emp Not Found"));
	}
	
	public Emp update(Emp emp, int empId) {
		
		Emp old = findById(empId);
		old.setCity(emp.getCity());
		old.setDesignation(emp.getDesignation());
		old.setEmpName(emp.getEmpName());
		old.setSalary(emp.getSalary());
		
		return emp;
	}
	
	public List<Emp> findAll(){ return emps;}
	
	public List<Emp> findByDesg(String desg){
		
		return emps.stream().filter(e->e.getDesignation().equalsIgnoreCase(desg)).collect(Collectors.toList());
	}
	
	public List<Emp> findByCity(String city){
			
		return emps.stream().filter(e->e.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
	}
	
	public void delete(int empId) {
		Emp emp = findById(empId);
		emps.remove(emp);
	}
	
}
