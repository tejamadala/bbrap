
public class PayFriend
{
public static void main(String[] args)
{
	double Amount;
	double fee=0;
	System.out.println("What is the payment amount?");
	Amount=IO.readDouble();
	if(Amount<=100)
	{
		fee=5;
	}
	else if(Amount>100 && Amount<1000)
	{
		fee=Amount*0.03;
		if(fee<6)
		{
			fee=6;
		}
	}
	else if(Amount>=1000 && Amount<10000)
	{
		fee=Amount*0.01;
		if(fee<15)
		{
			fee=15;
		}
	}
	else if(Amount>=10000)
	{
		if(Amount==10000)
		{
			fee=Amount*0.01;
		}
		else if(Amount<=15000 && Amount>10000)
		{
			Amount=Amount-10000;
			fee=Amount*0.02;
			fee=fee+(10000*0.01);
		}
		else if(Amount>15000)
		{
			Amount=Amount-15000;
			fee=Amount*0.03;
			fee=fee+(10000*0.01)+(5000*0.02);
		}
	}
	IO.outputDoubleAnswer(fee);
}
}