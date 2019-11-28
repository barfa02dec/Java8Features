package practice.com.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Class for perform operation on Employee class */
public class TestEmployee {

	private List<Employee> emp_list_one;
	private List<Employee> emp_list_two;
	static Scanner sc = new Scanner(System.in);

/* Function for comparing Id's of two list */
	public boolean compareIds(List<Employee> e1, List<Employee> e2) {
		
		if(e1.size()==0||e2.size()==0) {
			return false;
		}else if(e1.size()!=e2.size()) {
			return false;
		}else {
			boolean status = false;	
			for(Employee emp1 : this.emp_list_one) {
				for(Employee emp2 : this.emp_list_two) {
					if(emp1.equals(emp2)) {
						break;
					}
				}
				
			}
			return true;
		}
	}

	
	
	
	
	
	

}