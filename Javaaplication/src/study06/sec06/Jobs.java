package study06.sec06;

public class Jobs {
	 private String jobId;
	 private String jobTitle;
	 private int maxSalary;
	 private int minSalary;
	
	 public void setJobId(String jobId) {
		 this.jobId = jobId;
		 
	 }
	 public String getJobId() {
		 return jobId;
	 }
	 
	 public String getJobTitle() {
		 return jobTitle;
	 }
	 public void setJobTitle (String job) {
		 this.jobTitle = jobTitle;
	 }
	 public int getMaxSalary() {
		 return maxSalary;
	 }
	 public void setMaxSalary(int maxSalary) {
		 this.maxSalary = maxSalary;
	 }
	 

}
