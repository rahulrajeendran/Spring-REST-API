package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerclass {

	@Autowired
	private Operations ts;
	
	@RequestMapping("/details")
	public List<Details> Displayall(){
		return ts.Display();
	}
	
	@RequestMapping("/details/{id}")
	public Details Showsingle(@PathVariable("id") int str) {
		return ts.GetDetails(str);  
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/details")
	public void AddDetails(@RequestBody Details data) {
		ts.AddData(data);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/details/{id}")
	public void updateDetails(@RequestBody Details data, @PathVariable int id) {
		ts.updateData(id,data);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/details/{id}")
	public void deleteData(@PathVariable("id") int id) {
		 ts.deleteData(id);  
	}
}


