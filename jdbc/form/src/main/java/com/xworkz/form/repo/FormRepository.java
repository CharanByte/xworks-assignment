package com.xworkz.form.repo;

import com.xworkz.form.dto.FormDTO;

public interface FormRepository {

	boolean save(FormDTO formDTO);
}
