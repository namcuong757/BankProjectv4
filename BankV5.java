package CoreJava7;

import java.util.Scanner;


public class BankV5
{
	public String[] ids = new String[10];
	public String[] passWords = new String[10];
	public String admin;
	public String admin_passWord;
	public long[] balances = new long[10];
	public int size = 0;
	public String names[] = new String[10];
	public String addresses[] = new String[10];
	public String phone_nums[] = new String[10];	
	
	public BankV5() 
	{
		size = 2;
		admin = "admin";
		admin_passWord = "222";
		
		ids[0] = "user001";
		ids[1] = "user002";
		
		passWords[0] = "123456";
		passWords[1] = "1234";
		
		balances[0] = 1725;
		balances[1] = 5820;
		
		names[0] = "Nam Tran";
		names[1] = "Random Bot";
		
		addresses[0] = "123 Hi Street, San Diego, CA, 92111";
		addresses[1] = "125 Nice Street, San Jose, CA, 92151";
	
		phone_nums[0] = "504-754-1450";
		phone_nums[1] = "858-222-1111";
	}
	
	public BankV5(String[] ids, String[] passWords, long[] balances, int size)
	{
		this.ids = ids;
		this.passWords = passWords;
		this.balances = balances;
		this.size = size;
	}
	public BankV5(String[] ids, String[] passWords, long[] balances, int size, String[] names, String[] addresses, String[] phone_nums)
	{
		this.ids = ids;
		this.passWords = passWords;
		this.balances = balances;
		this.size = size;
		this.names = names;
		this.addresses = addresses;
		this.phone_nums = phone_nums;
	}
	
	public void log_in(BankV5_user person, BankV5_admin admin, ChatBot bot)
	{
		int cont = -1;
		Scanner scanner = new Scanner(System.in);
		bot.chatBot();
		do
		{
			System.out.println("What logIn do you choose?");
			System.out.println("1. User");
			System.out.println("2. Admin");
			System.out.println("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice)
			{
				case 1:
					person.user_check();
					break;
				case 2:
					admin.user_check();
			}
			System.out.println("Want to continue? ");
			System.out.println("1. Yes ");
			System.out.println("2. No ");
			System.out.println("Enter your choice: ");
			cont = scanner.nextInt();
			scanner.nextLine();
		}while(cont != 2);
		bot.say_bye();
		scanner.close();
	}
	
}
