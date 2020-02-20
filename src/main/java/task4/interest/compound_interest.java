package task4.interest;
import java.math.*;
public class compound_interest {

	double amount,numofyears,interest_rate;
	public compound_interest(double amount,double numofyears,double interest_rate) {
		// TODO Auto-generated constructor stub
		this.amount=amount;
		this.interest_rate=interest_rate;
		this.numofyears=numofyears;
	}
	public double cal_compound_interest() {
		return amount*Math.pow(1.0+interest_rate/100.0,numofyears)-amount;
	}

}
