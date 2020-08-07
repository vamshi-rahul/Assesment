package assignment3;
import java.util.*;
public class StudentMain {
Set<Student> set = new HashSet<Student>();
public static void main(String args[]) {
	StudentMain demo= new StudentMain();
	demo.runapp();
	}
public void runapp() {
	Student student1= new Student("223R4",24);
	set.add(student1);
	Student student2= new Student("253R6",19);
	set.add(student2);
	Student student3= new Student("273R9",22);
	set.add(student3);
	
	Iterator<Student> iterator=set.iterator();
	while(iterator.hasNext()) {
		Student student= iterator.next();
		System.out.println("age="+student.getAge()+" "+"Rollno:"+student.getRollno());
	}
	
	
}
}
