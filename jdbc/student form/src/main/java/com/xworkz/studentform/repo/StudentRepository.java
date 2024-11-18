package com.xworkz.studentform.repo;

import com.xworkz.studentform.dto.StudentDTO;

public interface StudentRepository {

	boolean save(StudentDTO studentDTO);
	
}
