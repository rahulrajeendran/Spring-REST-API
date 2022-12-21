package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Operations {

	private List<Details> details=new ArrayList<>( Arrays.asList(new Details(01,"Abhinand",80),
			new Details(02,"Rahul",85), new Details(03,"Vipin",90)
			));
	public List<Details> Display(){
		return details;
	}
	
	public Details GetDetails(int id) {
		return details.stream().filter(t -> t.getId()==id).findFirst().get();
	}
	
	public void AddData(Details data) {
		details.add(data);
	}

	public void updateData(int id, Details data) {
		for(int i=0;i<details.size();i++) {
			Details d=details.get(i);
			if(d.getId()==id) {
				details.set(i, data);
				return;
			}
		}
		
	}

	public void deleteData(int id) {
		
		details.removeIf(d -> d.getId()==id);
		
//		for(int i=0;i<details.size();i++) {
//			Details d=details.get(i);
//			if(d.getId()==id) {
//				details.remove(i);
//				return;
//			}
//		}
		
	}
}  