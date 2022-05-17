package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

@Autowired
private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		/*Employee employee=new Employee();
		employee.setFirstName("bola");
		employee.setLastName("folasade");
		employee.setEmailId("bola@gmail.com");
		employeeRepository.save(employee);
	*/
    }
}
