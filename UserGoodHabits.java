package sample;

import java.io.IOException;

public class UserGoodHabits extends User {

	public void getUserGoodHabits() throws IOException
	{
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("User Good Habits");	
		System.out.println("---------------------------------");
		System.out.println("Habit of doing daily Exercise?: ");
		String exercise=br.readLine();
		if(exercise.equalsIgnoreCase("yes"))
		{
			double exercise3per=(basepremium_age32*3)/100;
			basepremium_age32=(basepremium_age32-exercise3per);
			System.out.println();
			System.out.println("\t\t\t\t\t\t\tAfter reducing 3% for having Regular Exercise(Good Habit):"+basepremium_age32);
		}
		
		
	}
}
