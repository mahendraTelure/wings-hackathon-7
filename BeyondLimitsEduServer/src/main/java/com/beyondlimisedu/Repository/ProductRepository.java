package com.beyondlimisedu.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beyondlimisedu.Model.Category;
import com.beyondlimisedu.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	public List<Product> findByCategory(Category category);

}
