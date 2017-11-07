package sample;

import java.io.IOException;

public class UserBadHabits extends User {

	public void getUserBadHabits() throws IOException
	{
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("User Bad Habits");
		System.out.println("--------------------------------");
		System.out.println("Habit of Smoking?:");
		String smoking=br.readLine();
		System.out.println("Habit of Alcohol");
		String alcohol=br.readLine();
		System.out.println("Habit of drugs?: ");
		String drugs=br.readLine();
		if(smoking.equalsIgnoreCase("no") || alcohol.equalsIgnoreCase("yes") || drugs.equalsIgnoreCase("no"))
		{
			double alcohol3per=(basepremium_age32*3)/100;
			basepremium_age32=(basepremium_age32+alcohol3per);
			System.out.println();
			System.out.println("\t\t\t\t\t\t\tAfter increasing 3% for having Alcohol(Bad Habit):"+basepremium_age32);
			System.out.println();
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t-----------------------------------------------------------------");
			System.out.println("\t\t\t\t\t\t\t***Health Insurance Premium for Mr. Gomes: Rs."+basepremium_age32+"***");
			System.out.println("\t\t\t\t\t\t\t-----------------------------------------------------------------");
			
		}
		
	}
}
