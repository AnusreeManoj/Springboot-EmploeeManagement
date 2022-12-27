package com.webapp.demo.EmpManag;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeClass {
	
    @Id
	private int Id;
	private String Name;
	private String Email;
	private String department;
	public int getEmpId() {
		return Id;
	}
	public void setEmpId(int Id) {
		this.Id = Id;
	}
	public String getEmpName() {
		return Name;
	}
	public void setEmpName(String Name) {
		this.Name = Name;
	}
	public String getEmpEmail() {
		return Email;
	}
	public void setEmpEmail(String empEmail) {
		this.Email = empEmail;
	}
	public String getDept() {
		return department;
	}
	public void setDept(String department) {
		this.department = department;
	}
	
}