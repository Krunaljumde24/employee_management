/**
 * 
 */
package com.employeeMgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeMgmt.constants.StringConstants;
import com.employeeMgmt.entity.EmpEntity;
import com.employeeMgmt.repository.EmpRepository;

/**
 * @author Krunal
 *
 */

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = StringConstants.EMPLOYEE_MANAGEMENT_SVC)
public class EmpController {

	@Autowired
	private EmpRepository empRepository;

	@GetMapping(value = StringConstants.GET_EMPLOYEES)
	public List<EmpEntity> getAllEmployees() {
		return empRepository.findAll();
	}

	@PostMapping(value = StringConstants.ADD_EMPLOYEE)
	public EmpEntity addEmployee(@RequestBody final EmpEntity emp) {
		return empRepository.save(emp);
	}

	@GetMapping("/test")
	public String test() {
		return "controller working";
	}
}
