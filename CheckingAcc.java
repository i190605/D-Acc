import java.util.Scanner;

public class CheckingAcc {

	public int Accno;
	public String name;

	public String address;
	public int depo;
	public int bal;
	public int with;

	Scanner obj=new Scanner(System.in);
	void AccInfo()
	{
		System.out.println("Enter the Account Name ");
		
		name=obj.next();
		System.out.println("Enter the Account Balance ");
		
		bal =obj.nextInt();

		System.out.println("Enter the Account Number ");
		
		Accno=obj.nextInt();

	System.out.println("Enter the Address ");
		
		address=obj.next();
		
	}
	void makeDeposit()
	{
		System.out.println("Enter the amount you want to deposit ");
		depo=obj.nextInt();
		bal=bal+depo;
	}
	void makeWithdraw() {
		System.out.println("Enter the amount you want to withdraw");
		with=obj.nextInt();
		if(with>=bal)
		
		{
			if(with>5000)
		bal=bal-with;
		}
		else
		{
			System.out.println("The withdrawal amount exceds the account type limit ");
		}
		
	}
	void checkBalance()
	{
		System.out.println("Your Balance is");
		System.out.println(bal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		

		Scanner obj=new Scanner(System.in);
 
System.out.println("Enter Your choice");
System.out.println("1.Saving account");
System.out.println("2.Checking Account");


	}
	
}
