import model.Student;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Alex", 10, 'm', 1234);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getGender());
		System.out.println(s.getId());
	}

}
