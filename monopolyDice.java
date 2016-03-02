import java.util.Scanner;
import java.util.Random;
public class monopolyDice {

	public static void main(String[] args) {
		int die1=0,die2=0;
		String Continue="";
		Scanner sc = new Scanner(System.in);
		Random rnd =new Random();
		
		random_roll(Continue ,sc  ,die1 ,die2 ,rnd);
		

	}
	private static void random_roll(String Continue ,Scanner sc ,int die1 ,int die2 ,Random rnd)
	{
		System.out.println("Do you want to play? Type Yes to play:");
		int count = 0;
		
		Continue=sc.next();
		while(Continue.equalsIgnoreCase("yes"))
		{
			die1 = 1+rnd.nextInt(6);
			die2 = 1+rnd.nextInt(6);
			if(die1==die2 && count!=3)
			{
				System.out.println("Doubles:"+die1+","+die2);
				System.out.println("Move"+(die1+die2)+"spaces");
				count++;
			}
			else
			{
				System.out.println("You got :"+die1+","+die2);
				System.out.println("Move"+(die1+die2)+"spaces");
			}
			System.out.println("Do you wanna continue to play?");
			Continue =sc.next();
			if(count==3)
			{
				System.out.println("You are so going to prision");
			}
		}
	}
	

}
