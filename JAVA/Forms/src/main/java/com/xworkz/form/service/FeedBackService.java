package com.xworkz.form.service;

import com.xworkz.form.dto.FeedbackFormDTO;

public interface FeedBackService {

	boolean validateAndSave(FeedbackFormDTO feedBackDTO);
}
