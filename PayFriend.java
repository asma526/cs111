public class PayFriend{
	public static void main(String[] args){
    System.out.println("Give me an amount of money: ");
    double amount = IO.readDouble();
		double fee;

		if (amount > 100 && amount < 1000){
			fee= amount * .03;
				if (fee > 6){
				IO.outputDoubleAnswer(fee);
			}
			else{
				fee = 6;
				IO.outputDoubleAnswer(fee);
			}
		}
		else if (amount >= 1000 && amount < 10000){
			fee = amount * .01;
			if (fee > 15){
				IO.outputDoubleAnswer(fee);
			}
			else{
				fee = 15;
				IO.outputDoubleAnswer(fee);
			}
		}
		else if (amount >= 10000){
			if (amount > 10000 && amount <= 15000){
				fee =(10000 * .01) + ((amount - 10000) * .02);
				IO.outputDoubleAnswer(fee);
			}
			else if (amount >15000){
				fee = ((amount - 15000) * .03) + (5000 * .02) + (10000 * .01);
				IO.outputDoubleAnswer(fee);
			}
			else{
				fee = amount * .01;
				IO.outputDoubleAnswer(fee);
			}
		}
		else if (amount > 0){
			fee = 5.0;
			IO.outputDoubleAnswer(fee);
		}
	}
}
