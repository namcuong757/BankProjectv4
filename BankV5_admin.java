package CoreJava7;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BankV5_admin extends BankV5 implements Features{

	public BankV5_admin()
	{
		super();
	}
	@Override
	public void user_check() {
		// TODO Auto-generated method stub
		int flag = 0, conti = -1;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("\n################# ADMIN AREA #################\n" );
			System.out.println("ADMIN AUTHENTICATION" );
			System.out.println("Enter your adminID:" );
			String user = scanner.nextLine();
			System.out.println("Enter user Admin Password:" );
			String pass = scanner.nextLine();
			
			System.out.println("----LOGGING IN...");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for(int i = 0; i < size; i++) {
				if(admin.equals(user) && admin_passWord.equals(pass)) {
					
					System.out.println("\n---Successfully Logging In---\n" );
					int cont = 0;
					do
					{
						System.out.println("What do you want to do?");
						System.out.println("1. Print all users\n2. Add new user");
						System.out.println("Enter your choice");
						int choice = scanner.nextInt();
						
						switch(choice) {
							case 1: 
								display_all();
								break;
							case 2:
								add_user();
								break;
							default:
								System.out.println("Invalid answer");
						}
						System.out.print("Enter any number to return to menu\n0 to exit: ");
						cont = scanner.nextInt();
						scanner.nextLine(); // Consume the newline character
					}while(cont != 0);
					
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				System.out.println("====Failed to log in====\n");
				break;
			}
			
			System.out.println("Would you like to retry log in?\n1. Yes\n2. No");
			System.out.println("Enter your choice");
			conti = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character
		} while(conti != 2);
		say_bye();
		scanner.close();
	}

	@Override
	public void say_bye() {
		// TODO Auto-generated method stub
		System.out.println("LOG OUT OF ADMIN");
	}
	public void display_all()
	{
		
		for(int i = 0; i < size; i++)
		{
			System.out.println("UserID: " + ids[i]);			
			System.out.println("PassWord: " + passWords[i]);			
			System.out.println("Balances: " + balances[i]);		
			System.out.println("Name: " + names[i]);		
			System.out.println("Address: " + addresses[i]);;		
			System.out.println("Phone Number: " + phone_nums[i]);
			System.out.println("---------------------" );
		}
		
	}
	public boolean add_user() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to add a new user?\n1. Yes\n2. No" );
		int choice = scanner.nextInt();
		scanner.nextLine();
		if(choice == 1)
		{
			System.out.println("== ADDING NEW USER ==" );
			System.out.println("Enter user userID:" );
			String user = scanner.nextLine();
			System.out.println("Enter user password:" );
			String pass = scanner.nextLine();
			System.out.println("Enter user balance:" );
			int balance = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter user Name:" );
			String name = scanner.nextLine();
			System.out.println("Enter user Address:" );
			String address = scanner.nextLine();
			System.out.println("Enter user PhoneNumbers:" );
			String phone = scanner.nextLine();
			
			super.ids[size] = user;
			super.passWords[size] = pass;
			super.balances[size] = balance;
			super.names[size] = name;
			super.addresses[size] = address;
			super.phone_nums[size] = phone;
			super.size++;
			System.out.println("-Succefully Added-" );
			scanner.close();
			return true;
		}
		scanner.close();
		return false;
	}
	@Override
	public void chatBot() {
		// TODO Auto-generated method stub
		
	}

}
