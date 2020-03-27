package ua.lviv.iot.spring.labseven.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.spring.labseven.data.StudentRepository;
import ua.lviv.iot.spring.labseven.rest.RestAplication.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public Student createStudent(Student student) {

		return studentRepository.save(student);
	}
}
