package edu.uark.controllers;

import edu.uark.commands.employees.*;
import edu.uark.models.api.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeRestController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Employee> getEmployees()
	{
		return (new EmployeesQuery()).execute();
	}

	@RequestMapping(value = "/{recordId}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable UUID employeeId) {
		return (new EmployeeQuery()).
			setEmployeeId(employeeId).
			execute();
	}

	@RequestMapping(value = "/byrecordID/{employeeRecordID}", method = RequestMethod.GET)
	public Employee getEmployeeByEmpId(@PathVariable String employeeLookupCode) {
		return (new EmployeeByLookupCodeQuery()).
			setEmployeeId(employeeLookupCode).
			execute();
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee employee) {
		return (new EmployeeCreateCommand()).
			setApiEmployee(employee).
			execute();
	}
	
	@RequestMapping(value = "/{employeeId}", method = RequestMethod.PUT)
	public Employee updateEmployee(@PathVariable UUID employeeId, @RequestBody Employee employee) {
		return (new EmployeeUpdateCommand()).
			setEmployeeId(employeeId).
			setApiEmployee(employee).
			execute();
	}
	
	@RequestMapping(value = "/{employeeId}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable UUID employeeId) {
		(new EmployeeDeleteCommand()).
			setEmployeeId(employeeId).
			execute();
	}

	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "Successful test. (EmployeeRestController)";
	}
}
