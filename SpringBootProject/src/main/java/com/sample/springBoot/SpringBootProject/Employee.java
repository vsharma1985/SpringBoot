package com.sample.springBoot.SpringBootProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "emp_tbl")
public class Employee {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long emp_id;
	  
	  @NotNull
	  private String emp_name;
	  
	  @Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	}

	public Employee() { }

	  public Employee(long emp_id) { 
	    this.emp_id = emp_id;
	  }
	  
	  public Employee( String emp_name) {
	     this.emp_name = emp_name;
	  }

		public long getEmp_id() {
			return emp_id;
		}
	
		public String getEmp_name() {
			return emp_name;
		}
	
		public void setEmp_id(long emp_id) {
			this.emp_id = emp_id;
		}
	
		public void setEmp_name(String emp_name) {
			this.emp_name = emp_name;
		}
}
