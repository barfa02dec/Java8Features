package practice.com.problem;

/* Class for employee details */

public class Employee {
	private int id;
	private String name;//if name == null
	
	public Employee() {
	
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
		
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		if(this.getId()==e.getId()) {
			return true;
		}
		return false;
	}
}