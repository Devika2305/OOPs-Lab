package balance;
import balance.Account;
import java.util.Scanner;
public class importedDisplayClasss {
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Balance: ");
		int bal = sc.nextInt();
		Account obj = new Account();
		obj.displayBalance(bal);
		sc.close();
	}

}
