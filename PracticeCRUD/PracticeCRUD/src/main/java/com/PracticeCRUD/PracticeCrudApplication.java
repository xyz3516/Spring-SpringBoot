package com.PracticeCRUD;

import com.PracticeCRUD.Dao.UserRepository;
import com.PracticeCRUD.Entities.Person;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class PracticeCrudApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PracticeCrudApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

//		Person person = new Person();
//		person.setName("Vaibhav");
//		person.setAddress("Anand Nagar, Jeur Patoda, Kopargaon");
//		person.setMobileNo("1234567890");
//		person.setSalary(100000);

//		Person person1 = new Person();
//		person1.setName("XYZ");
//		person1.setAddress("Pune");
//		person1.setMobileNo("123456");
//		person1.setSalary(1234);
//
//		Person person2 = new Person();
//		person2.setName("ABC");
//		person2.setAddress("Noida");
//		person2.setMobileNo("678910");
//		person2.setSalary(5678);



		// This line will save only single user
//		Person resultperson1 = userRepository.save(person1);
//		Person resultperson2 = userRepository.save(person2);

//		List<Person> persons = List.of(person1, person2);
//
//		Iterable<Person> result = userRepository.saveAll(persons);
//
//		result.forEach(person -> {
//			System.out.println(person);
//		});


		// Updating the data of user whose id is 5
		Optional<Person> optional = userRepository.findById(5);
		Person person = optional.get();

		person.setName("Ram Singh");
		person.setAddress("Banglore, Cluster 1");

		userRepository.save(person);



		System.out.println(person);
	}

}
