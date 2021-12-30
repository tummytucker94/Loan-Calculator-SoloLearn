import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		//your code goes here
		
		//what are at least three different ways to represent a percentage

			//10% (this is percentage form)
			//0.1 (this is decimal form)
			//10 / 100 (this is fraction form)

        //converts "amount" to a float
        float amountToFloat = (float) amount;

        for(int i = 0; i < 3; i++){

            //gets the interest
		    float interest = amountToFloat * 0.1f;

            //sets the value of "remainingAmount" to "amountToFloat - interest"
            //calculates the amount left to pay
            float remainingAmount = amountToFloat - interest;
            amountToFloat = remainingAmount;
            
            if(i == 2){
                int amountToInt = (int) amountToFloat;
                System.out.println(amountToInt);
            } 
        }

	}
}
