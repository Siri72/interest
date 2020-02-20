package task4.interest;

public class simple_interest {
	double amount,years,rate; 
	public simple_interest(double amount,double years,double rate) {
		// TODO Auto-generated constructor stub
		this.amount=amount;
		this.rate=rate;
		this.years=years;
	}
	public double calculate()
	{
		return amount*years*rate/100;
	}

}
