package com.amdocs.restapiex.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.amdocs.restapiex.model.Employee;
import com.amdocs.restapiex.service.EmployeeService;
import com.amdocs.restapiex.service.EmployeeServiceImpl;

@Path("/employee")
public class EmployeeResource {
	EmployeeService employeeService = new EmployeeServiceImpl();
	
	@POST // http post method.
	// json object 
	@Produces(MediaType.APPLICATION_JSON)//  will send the response in json 
	@Consumes(MediaType.APPLICATION_JSON) // will accept the data in json
	public Response addEmployee(Employee employee) {
		employeeService.addEmployee(employee);
		return Response.status(201).build();

}
	@GET
	@Path("/{id}")
	public Response getEmployeeById(@PathParam("id") String id) {
		Employee employee = employeeService.getEmployeeById(id);
		if(employee!=null)
		return Response.ok().entity(employee).build();
		else
			return Response.status(404).entity("no record found").build();
	}
	
}
