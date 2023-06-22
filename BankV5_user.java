package CoreJava7;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BankV5_user extends BankV5 implements Features{
	
	public BankV5_user() 
	{
		super();
	}
	
	public BankV5_user(String[] ids, String[] passWords, long[] balances, int size) {
		super(ids, passWords, balances, size);
	}
	public BankV5_user(String[] ids, String[] passWords, long[] balances, int size, String[] names, String[] addresses, String[] phone_nums)
	{
		super(ids, passWords, balances, size, names, addresses, phone_nums);
	}
	
	
	@Override
	public void user_check() {
		// TODO Auto-generated method stub
		int flag = 0, conti = -1;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("\n$$$$$$$$$$$$$ Online Banking Personal $$$$$$$$$$$$$\n" );
			System.out.println("Would you like to view your balance?" );
			System.out.println("Enter your userID:" );
			String user = scanner.nextLine();
			System.out.println("Enter your password:" );
			String pass = scanner.nextLine();
			
			System.out.println("----LOGGING IN...");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for(int i = 0; i < size; i++) {
				if(ids[i].equals(user) && passWords[i].equals(pass)) {
					System.out.println("---Successfully Logging In---" );
					
					System.out.println("=====================================");
					System.out.println("#Client Informations#");
					System.out.println("Name: " + names[i]);
					System.out.println("Address: " + addresses[i]);
					System.out.println("Phone Number: " + phone_nums[i]);
					System.out.println("=====================================");
					
					System.out.println("Would you like to view your balance?");
					System.out.println("1. Yes\n2. No");
					System.out.println("Enter your choice");
					int choice = scanner.nextInt();
					
					switch(choice) {
						case 1: 
							System.out.println("Your current balance: $" + balances[i]);
							break;
						case 2:
							say_bye();
							break;
						default:
							System.out.println("Invalid answer");
					}
					
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				System.out.println("====Failed to log in====\n");
			}
			
			System.out.println("Would you like to view another account?\n1. Yes\n2. No");
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
		System.out.println("LOG OUT OF USER");
	}

	@Override
	public void chatBot() {
		// TODO Auto-generated method stub
		
	}

	

}
