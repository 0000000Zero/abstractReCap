package abstractReCap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerManager cManager = new CustomerManager();
		cManager.dataBaseManager = new MySqlServerManager();
		// istediğimiz veri tabanı ile çalışabiliriz.
		cManager.getCustomer();
	}

}
