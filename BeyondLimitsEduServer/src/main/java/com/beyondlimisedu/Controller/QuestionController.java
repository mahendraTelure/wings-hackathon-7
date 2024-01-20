package com.beyondlimisedu.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beyondlimisedu.Model.Questions;
import com.beyondlimisedu.Repository.QuestionsRepository;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class QuestionController {
	
	@Autowired
	QuestionsRepository questionsRepository;
	
	@PostMapping("/question")
	public Questions addQuestion(@RequestBody Questions user) {
		return questionsRepository.save(user);

	}

	@GetMapping("/question")
	public List<Questions> getQue() {
		return questionsRepository.findAll();
	}



	
}

