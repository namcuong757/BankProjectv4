package CoreJava7;

public class BankV5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankV5 main = new BankV5();
		BankV5_user user = new BankV5_user();
		BankV5_admin admin = new BankV5_admin();
		ChatBot bot = new ChatBot();
		main.log_in(user, admin, bot);
	}

}
