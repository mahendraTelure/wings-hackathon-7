package com.beyondlimisedu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beyondlimisedu.Model.Questions;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Long>{

	Questions save(Questions question);


}
