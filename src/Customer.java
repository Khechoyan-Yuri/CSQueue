public class Customer{
	//Variables
	String firstname;
	String lastname;
	double mobilenumber;
	int place;
	
	
	public Customer(){//DEFAULT CONSTRUCTOR
		firstname = "unknown";
		lastname = "unknown";
		mobilenumber = -1;
		place = -1;
	}
	public Customer(String name,String last_name){//constructor for the customer
		firstname = name;
		lastname = last_name;
		
	}
//SETTERS AND GETTERS
	public void SetName(String name){
		firstname = name;
	}
	public void SetLastName(String last_name){
		lastname = last_name;
	}
	public void SetNumber(double number){
		mobilenumber = number;
	}
	public String GetName(){
		return firstname;
	}
	public String GetLastName(){
		return lastname;
	}
	public double GetNumber(){
		return mobilenumber;
	}
	
}