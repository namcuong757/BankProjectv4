package CoreJava7;

import java.util.Scanner;

public class ChatBot implements Features{
	@Override
	public void user_check() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void say_bye() {
		// TODO Auto-generated method stub
		System.out.println("Thank you for using Online Banking");
	}

	@Override
	public void chatBot() {
		// TODO Auto-generated method stub
		System.out.println("Online Banking Application");
		System.out.println("====================");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello...What is your name?");
		String name = scanner.nextLine();
		scanner.close();
		System.out.println("Hello " + name + "! How are you today?" );
	}	
}
