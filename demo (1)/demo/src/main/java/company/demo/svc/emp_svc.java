package company.demo.svc;



import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;

import company.demo.entity.emp_entity;
import company.demo.repo.emp_repo;

@Service
public class emp_svc {
	
	@Autowired
	private emp_repo com_repo;
	
	public emp_entity addEmployeeser(emp_entity  emp_ser) {
		
		com_repo.save(emp_ser);
		
		return emp_ser;
	}

	public emp_entity getemployeebyid(int iD) {
		// TODO Auto-generated method stub
		emp_entity get=com_repo.findById(iD).orElse(null);
		return get;
	}


	public List <emp_entity> getall() {
		// TODO Auto-generated method stub
		List <emp_entity> getall= com_repo.findAll();
		return getall;
	}
	
	public String updateone( emp_entity put, int ID) {
		
		emp_entity updating=com_repo.findById(ID).orElse(null);
		
		if (put !=null) {
			//emp_entity updating = new emp_entity();
			updating.setName(put.getName());
			updating.setRole(put.getRole());
			updating.setLocation(put.getLocation());
			updating.setSalary(put.getSalary());
			
			emp_entity updated=com_repo.save(updating);
			return "updated successfully";
			
		}
		else {
			return "not available";
		}
		
		
	}
	
	public String deleteone (int ID) {
		
		emp_entity delete=com_repo.findById(ID).orElse(null);
		
		if (delete != null) {
			com_repo.deleteById(ID);
			return "Deleted Seccessfully";
		}
		else {
			return "not avaliable";
			
					
		}
		
	}

}