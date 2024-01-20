package com.beyondlimisedu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beyondlimisedu.Model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
