package Tax;
import java.util.Scanner;

class Tax
{
	int org_inc,income,inv,health_ins1,health_ins2,house_loan,edu_loan,NPS,Charity,FD,HRA,health;
	
	public void Insert()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Your Annual Income : ");
		income = sc.nextInt();
		org_inc = income;
		System.out.print("\n Enter Your Sum-Investments In (PPF,EPF,NSC & ELSS) : ");
		inv = sc.nextInt();
		System.out.print("\n Enter Your Premium Paid On Health Insurance (First For Under 60 Yrs & Then For Above 60 Yrs : ");
		health_ins1 = sc.nextInt();
		health_ins2 = sc.nextInt();
		System.out.print("\n Enter Intrest Paid On Housing Loan : ");
		house_loan = sc.nextInt();
		System.out.print("\n Enter Education Loan : ");
		edu_loan = sc.nextInt();
		System.out.print("\n Enter Deductions For The Contribution Made To The NPS (National Pension Scheme) : ");
		NPS = sc.nextInt();
		System.out.print("\n Enter Donations Made : ");
		Charity = sc.nextInt();
		System.out.print("\n Enter Instrest Earned From Savings Account : ");
		FD = sc.nextInt();
		System.out.print("Enter HRA : ");
		HRA = sc.nextInt();
		System.out.print("Enter Amount Paid For Treatment Of Diseases : ");
		health = sc.nextInt();
	}
	
	public void inv()
	{
		if(inv <= 150000)
		{
			income = income - inv;
		}
	}
	
	public void Ins()
	{
		if(health_ins1 <= 25000)
		{
			income = income - health_ins1;
		}
		if(health_ins2 <= 50000)
		{
			income = income - health_ins2;
		}
	}
	public void hloan()
	{
		if(house_loan <= 200000)
		{
			income = income - house_loan;
		}
	}
	public void sloan()
	{
		income = income - edu_loan;
	}
	
	public void nps()
	{
		if(NPS >= 150000)
		{
			income = income - 50000;
		}
	}
	
	public void dono()
	{
		if( Charity > 0)
		{
			income = income - Charity;
		}
	}
	
	public void intr()
	{
		if(FD <= 10000)
		{
			income = income - FD;
		}
	}
	
	public void hra()
	{
		int a = org_inc * 25 / 100;
		if (HRA <= 60000 || HRA <= a)
		{
			income = income - HRA;
		}
	}
	
	public void heal()
	{
		if(health > 0)
		{
			income = income - health;
		}
	}
	
	public void comp()
	{
		if( income <= 300000)
		{
			System.out.println("You Do Not Have To Pay Any Income Tax!");
		}
		
		else if(income >= 300001 && income <= 700000 )
		{
			income = income * 5 / 100;
			System.out.println("Your Owe The Government : " + income + " Rupees!");
		}
		
		else if( income >= 700001 && income <= 1000000)
		{
			income = income * 10 / 100;
			System.out.println("You Owe The Government : " + income + " Rupees!");
		}
		else if( income >= 1000001 && income <= 1200000 )
		{
			income = income * 15 / 100;
			System.out.println("You Owe The Government : " + income + " Rupees!");
		}
		else if( income >= 1200001 && income <= 1500000)
		{
			income = income * 20 / 100;
			System.out.println("You Owe The Government : " + income + " Rupees!");
		}
		else if( income >= 1500001)
		{
			income = income * 30 / 100;
			System.out.println("You Owe The Government :" + income + " Rupees!");
		}
		else
		{
			System.out.println("ERROR!");
		}
	}
}
public class main {
	public static void main( String[] args)
	{
		Tax t1 = new Tax();
		t1.Insert();
		t1.inv();
		t1.Ins();
		t1.hloan();
		t1.sloan();
		t1.nps();
		t1.dono();
		t1.intr();
		t1.hra();
		t1.heal();
		t1.comp();
	}
}
