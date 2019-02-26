package edu.uark.models.api;

import edu.uark.models.entities.EmployeeEntity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Employee {

	//record ID
	private String record_id;

	public String getRecord_ID()
	{
		return this.record_id;
	}

	public Employee setRecord_ID(String record_id) {
		this.record_id = record_id;
		return this;
	}


	//first name
	private String first_name;

	public String getFirstName() {
		return this.first_name;
	}
	public Employee setFirstName(String first_name) {
		this.first_name = first_name;
		return this;
	}

	//last name
	private String last_name;

	public String getLastName() {
		return this.last_name;
	}
	public Employee setLastName(String last_name) {
		this.last_name = last_name;
		return this;
	}

	//employee id
	private String emp_ID;

	public String getEmpID() {
		return this.emp_ID;
	}
	public Employee setEmpID(String emp_ID) {
		this.emp_ID = emp_ID;
		return this;
	}

	//bool
	private String active_bool;

	public String getBool() {
		return this.active_bool;
	}
	public Employee setBool(String active_bool) {
		this.active_bool = active_bool;
		return this;
	}

	//role
	private int role;

	public int getRole() {
		return this.role;
	}
	public Employee setRole(int role) {
		this.role = role;
		return this;
	}


	//do not touch
	private LocalDateTime createdOn;
	public LocalDateTime getCreatedOn() {
		return this.createdOn;
	}
	public Employee setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
		return this;
	}

	public Employee() {
		this.record_id = "temp Record_ID";
		this.first_name = "temp first-Name";
		this.last_name = "temp-last-Name";
		this.emp_ID = "temp Emp_Id";
		this.active_bool = "temp true-bool";
		this.role = 0;

		this.createdOn = LocalDateTime.now();
	}

	public Employee(EmployeeEntity employeeEntity)
	{
		this.record_id = employeeEntity.getRecord_ID();
		this.first_name = employeeEntity.getFirstName();
		this.last_name = employeeEntity.getLastName();
		this.emp_ID = employeeEntity.getEmpID();
		this.active_bool = employeeEntity.getBool();
		this.role = employeeEntity.getRole();


		this.createdOn = employeeEntity.getCreatedOn();
	}
}
