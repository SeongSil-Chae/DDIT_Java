package study06.sec06;

public class Department {
	String departmentId;
	String departmentName;
	int manageId;
	String locationId;
		
	
	public void setDepartmentId(String departmentId){
		this.departmentId = departmentId;
	}
	
	
	public String getDepartmentId(){
		return departmentId;
	}
	
	public void setDepartmentName(String departmentName){
		this.departmentName = departmentName;
	}
	
	
	public String getDepartmentName(){
		return departmentName;
	}
	
	public void setManageId(int manageId){
		this.manageId = manageId;
	}
	
	
	public int getManageId(){
		return manageId;
	}
	
	public void setLocationId(String locationId){
		this.locationId = locationId;
	}
	
	
	public String getLocationId(){
		return locationId;
	}
	
	
}
