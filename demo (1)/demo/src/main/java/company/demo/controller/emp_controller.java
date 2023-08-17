package company.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import company.demo.entity.emp_entity;
import company.demo.svc.emp_svc;

@RestController
public class emp_controller {
	
	@Autowired
	public emp_svc com_svc;
	
	@PostMapping
	public emp_entity addemployee (@RequestBody emp_entity emp_info) {
	
	return com_svc. addEmployeeser(emp_info);
	
	}
    
	@GetMapping("/get/{ID}")
	public emp_entity getvalueid (@PathVariable int ID ) {
	
	return 	com_svc.getemployeebyid(ID);
		
	
	}
	@GetMapping("/getall")
	public List <emp_entity> getvalueid  () {
	
	return 	com_svc.getall();
		
	
	}
	
	@PutMapping("/update/{ID}")
	public String updatestatus ( @RequestBody emp_entity update_data,@PathVariable int ID) {
		
		return com_svc.updateone(update_data, ID);
	}
	
	@DeleteMapping("/delete/{ID}")
	public String deletestatus (@PathVariable int ID) {
		return com_svc.deleteone(ID);
	}
        	

	
}   