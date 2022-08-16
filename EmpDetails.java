class EmpDetails{
	int EmployeeID;
	String FirstName;
	String LastName;
	String EmailId;
	double Salary;
	EmpDetails(int employeeID,String FirstName,String LastName,String EmailId,double Salary){
	
	this.EmployeeID =  EmployeeID;
	this.FirstName  =  FirstName;
	this.LastName   = LastName;
	this.EmailId    = EmailId;
	this.Salary     = Salary;
}

	public static void main(String[] args){
	EmpDetails emp = new EmpDetails(817304 ,"Kalayyagari","Sumanth","KS00817304@techmahindra.com",25.000); {
	System.out.println("my Employee id : "+emp.EmployeeID);
	System.out.println("my FirstName is : "+emp.FirstName);
	System.out.println("my LastName is : "+emp.LastName);
	System.out.println("my EmailID is : "+emp.EmailId);
	System.out.println("my Salary is : "+emp.Salary);
	}
}
}
