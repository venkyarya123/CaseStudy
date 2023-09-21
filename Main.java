import java.util.Scanner;

public class Main {
	public static Emp getEmpData(Scanner s)
	{
		System.out.println("Enter Emp Id");
		int id = s.nextInt();

		System.out.println("Enter Emp Name");
		String name = s.next();

		System.out.println("Enter Emp Desg");
		String desg = s.next();
		

		System.out.println("Enter Emp City");
		String city = s.next();

		System.out.println("Enter Emp Salary");
		int sal = s.nextInt();
		
		return new Emp(id, name, desg, city, sal);
	}
	public static void main(String[] args) {
		
		EmpRepo empRepo = new EmpRepo();
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("1. Add Emp\n2. Update\n3. Delete\n4. Find\n5. Exit");
			System.out.println("Enter option: ");
			int option = s.nextInt();
			
			switch(option) {
				case 1:
					empRepo.addEmp(getEmpData(s));	
					System.out.println("Record Inserted Successfully !!");	break;
				
				case 2:
					System.out.println("Enter EmpId for Update: ");
					int e = s.nextInt();
					empRepo.update(getEmpData(s), e);
					break;
					
				case 3:
					System.out.println("Enter EmpId for Delete: ");
					e = s.nextInt();
					empRepo.delete(e); 
					break;
					
					
				case 4:
					System.out.println("1. Find by Id\n2. By Desg \n3. By City \n4. All");
					int x = s.nextInt();
					switch(x)
					{
					case 1:
						System.out.println("Enter EmpId for Update: ");
						e = s.nextInt();
						System.out.println(empRepo.findById(e));
						break;
					case 2:
						System.out.println("Enter Desg: ");
						String desg = s.next();
						System.out.println(empRepo.findByDesg(desg));
						break;
					case 3:
						System.out.println("Enter City: ");
						String city = s.next();
						System.out.println(empRepo.findByCity(city));
						break;
					case 4:
						
						System.out.println(empRepo.findAll());
					
					}
					break;
				case 5:
					System.exit(0);
					
			}
		}

	}

}
