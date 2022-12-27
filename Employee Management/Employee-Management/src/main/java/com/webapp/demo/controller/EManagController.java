package com.webapp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.demo.dao.empManagdao;
import com.webapp.demo.EmpManag.EmployeeClass;

@RestController
public class EManagController {

	@Autowired
	empManagdao dao;
@RequestMapping("/addEmp")
@ResponseBody
public void addEmp(@RequestParam int empid, @RequestParam String empname, @RequestParam String empemail, @RequestParam String empdept, EmployeeClass obj) {
	
	obj.setEmpId(empid);
	obj.setEmpName(empname);
	obj.setEmpEmail(empemail);
	obj.setDept(empdept);
	dao.save(obj);
	System.out.println("emp added");
	
}

@RequestMapping("/delete")
@ResponseBody
public void deleteEmp(@RequestParam int empid) {
	
	System.out.println("emp deleted");
	dao.deleteById(empid);
	
}

@RequestMapping("/getAll")
@ResponseBody
public List<EmployeeClass> getAll() {
	
	return dao.findAll();
}

@RequestMapping("/getById")
@ResponseBody
public List<EmployeeClass> getById(@RequestParam int empid) {
	System.out.println("emp by id");
	return dao.empById(empid);
	
}

@RequestMapping("/deleteAll")
@ResponseBody
public void deletetAll() {
	
	 dao.deleteAll();
}


}