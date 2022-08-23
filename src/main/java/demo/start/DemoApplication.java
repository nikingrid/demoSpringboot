package demo.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		Student student1= new Student();
		
		student1.setId(100);
		student1.setFirstName("Carlos");
		student1.setLastName("Sainz");
		
		System.out.println(student1.getId());
		System.out.println(student1.getFirstName());
		System.out.println(student1.getLastName());
		
		
	}

}
