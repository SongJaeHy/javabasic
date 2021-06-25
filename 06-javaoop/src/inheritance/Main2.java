package inheritance;

public class Main2 {

	
	
	
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "채종훈";
		s1.age = 25;
		s1.major = "경영학";
		
		s1.getStudentInfo();
		
		Salaryman sm1 = new Salaryman();
		
		sm1.name = "김직장인";
		sm1.age = 35;
		sm1.salary = 6000;
		//sm1.major = "수학과";
		sm1.upSalary();
		sm1.getSalaryInfo();
	}

}
