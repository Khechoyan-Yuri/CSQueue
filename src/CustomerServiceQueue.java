import java.util.*;


public class CustomerServiceQueue{
	//COMMENT
	
	public static void main(String[] args){
		
		ArrayList<Customer> CustomerList = new ArrayList<Customer>();//Customer ArrayList
		
		System.out.println("Welcome To The Verizon Store!");
		
		//Scanners
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		
		String command = "";
		
		while(1==1){//Go until the store presses n
			System.out.println("Enter \"add\" to add, enter \"delete\" to delete, enter \"exit\" to exit, and enter \"print\" to print the list!");
			command = input4.nextLine();
			if(command.equals("add")){
				System.out.println("Please enter the first name, last name, and phone number!");
				System.out.print("First Name: ");
				String firstname = input.nextLine();
				System.out.print("Last Name: ");
				String lastname = input2.nextLine();
				System.out.print("Mobile Number: ");
				double number = input3.nextDouble();
				Customer customer = new Customer(firstname,lastname);
				CustomerList.add(customer);
				
			}else if(command.equals("delete")){
				System.out.println("The first person in the queue is erased!");
				CustomerList.remove(0);
				if(CustomerList.isEmpty()){
					System.out.println("There is nobody in the queue!");
				}
				
			}else if(command.equals("print")){
				for(int place = 0;place<CustomerList.size();place++){
					System.out.println(place +"-"+ CustomerList.get(place).firstname + " " + CustomerList.get(place).lastname);
				}
			}else if(command.equals("exit")){
				break;
			}
		}	
		input.close();
		input2.close();
		input3.close();
		input4.close();	
	}
}
