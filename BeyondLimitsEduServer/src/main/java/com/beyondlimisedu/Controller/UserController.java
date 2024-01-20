package com.beyondlimisedu.Controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beyondlimisedu.Model.Role;
import com.beyondlimisedu.Model.User;
import com.beyondlimisedu.Repository.RoleRepository;
import com.beyondlimisedu.Repository.UserRepository;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

//	getting all users
	@GetMapping("/user")
	public List<User> getUser() {
		return userRepository.findAll();
	}
	
	@PostMapping("/login")
	public User updateUser(@RequestBody User user) {
		return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
	}

//	adding user to the database
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);

	}

//	getting single employee
	@GetMapping("/user/{id}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable(value = "id") Long userId) {
		Optional<User> user = userRepository.findById(userId);
		return ResponseEntity.ok().body(user);
	}

//	deleting employee
	@DeleteMapping("/user/{id}")
	public User deleteUser(@PathVariable(value = "id") Long userId) throws Exception {
		User user = userRepository.getById(userId);
		userRepository.delete(user);
		return user;

	}

//	Put method mapped and endpoint is /emp/
//	@PutMapping("/emp/{id}")
//	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
//			@RequestBody Employee employeeDetails) throws ResourceNotFoundException {
//		Employee employee = employeeRepository.findById(employeeId)
//				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
//		employee.setId(employeeId);
//		employee.setFirstName(employeeDetails.getFirstName());
//		employee.setLastName(employeeDetails.getLastName());
//		employee.setAddress(employeeDetails.getAddress());
//		employee.setCountry(employeeDetails.getCountry());
//		employee.setCity(employeeDetails.getCity());
//		employee.setDateOfBirth(employeeDetails.getDateOfBirth());
//		employee.setGender(employeeDetails.getGender());
//		employee.setMobile(employeeDetails.getMobile());
//		employee.setEmail(employeeDetails.getEmail());
//		final Employee updatedEmployee = employeeRepository.save(employee);
//		return ResponseEntity.ok(updatedEmployee);
//	}

//	updating the employee
	@PutMapping("/user")
	public User updatdeEmp(@RequestBody User user) {
		return this.userRepository.save(user);
	}

//
////	@PostConstruct
//	public void initRolesAndUser() {
//		Role adminRole = new Role();
//		adminRole.setRoleName("Admin");
//		adminRole.setRoleDescription("Admin Role "); 
//
//		Role userRole = new Role();
//		userRole.setRoleName("User");
//		userRole.setRoleDescription("Default role for newly created user"); 
//
//		User adminUser = new User();
//		adminUser.setUsername("admin");
//		adminUser.setEmail("admin@gmail.com");
//		adminUser.setMobile("1234567890");
//		adminUser.setPassword("admin");
//		Set<Role> adminRoles = new HashSet<>();
//		adminRoles.add(adminRole);
//		adminUser.setRole(adminRoles);
//		userRepository.save(adminUser);
//		
//		User user = new User();
//		user.setUsername("user");
//		user.setEmail("user@gmail.com");
//		user.setMobile("1234567890");
//		user.setPassword("user");
//		Set<Role> userRoles = new HashSet<>();
//		userRoles.add(userRole);
//		user.setRole(userRoles);
//		userRepository.save(user);

//	}

}
