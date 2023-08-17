package company.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_info")

public class emp_entity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int IDno;
	private String name;
	private String role;
	private String Location;
	private int Salary;
	
	public int getIDno() {
		return IDno;
	}
	public void setIDno(int iDno) {
		IDno = iDno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	
}