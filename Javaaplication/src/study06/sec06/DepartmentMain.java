package study06.sec06;

public class DepartmentMain {
	public static void main(String[] args) {
		Department d1= new Department();
		d1.setDepartmentId(10);
		d1.departmentName("asd");
		d1.manageId(200);
		d1.setLocationId(1700);
		
		System.out.println(d1.setDepartmentId()+"\t"+d1.departmentName("asd")+"\t"+
				d1.manageId()+"\t"+d1.setLocationId());
	}
}
