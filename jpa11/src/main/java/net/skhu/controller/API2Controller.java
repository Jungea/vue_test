package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.domain.Registration;
import net.skhu.domain.Student;
import net.skhu.repository.RegistrationRepository;
import net.skhu.repository.StudentRepository;

@RestController
@RequestMapping("api2")
public class API2Controller {

	@Autowired
	StudentRepository studentRepository;
	@Autowired
	RegistrationRepository registrationRepository;

	@RequestMapping("test1")
	public List<Student> test1() {
		return studentRepository.findByName("고은별");
	}

	@RequestMapping("test2")
	public List<Student> test2() {
		return studentRepository.findByNameStartsWith("고");
	}

	@RequestMapping("test3")
	public List<Student> test3() {
		return studentRepository.findByDepartment_Name("국어국문학");
	}

	@RequestMapping("test4")
	public List<Student> test4() {
		return studentRepository.findByDepartment_NameStartsWith("국어");
	}

	@RequestMapping("test5")
	public List<Student> test5() {
		return studentRepository.findAllByOrderByName();
	}

	@RequestMapping("test6")
	public List<Student> test6() {
		return studentRepository.findAllByOrderByNameDesc();
	}
	
    @RequestMapping("test7")
    public List<Student> test7() {
    	return studentRepository.findByDepartment_IdOrderByNameDesc(1);
    }
    
    @RequestMapping("test8")
    public List<Student> test8() {
    	return studentRepository.findByDepartment_IdAndDepartment_NameStartsWith(1, "국");
    }
    
    @RequestMapping("test9")
    public List<Registration> test9() {
    	return registrationRepository.findByStudent_Name("이상");
    }

}
