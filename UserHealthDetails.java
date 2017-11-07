package sample;

import java.io.IOException;

public class UserHealthDetails extends User {

	public void getCurrentHealthDetails() throws IOException
	{
		System.out.println();
		System.out.println();
	System.out.println("------------------------");
	System.out.println("Current Health Details");
	System.out.println("------------------------");
	System.out.print("Do you have Hypertension?:");
	String hypertension=br.readLine();
	System.out.println("Do you have Blood Pressure?:");
	String bp=br.readLine();
	System.out.println("Do you have Blood Sugar?:");
	String bs=br.readLine();
	System.out.println("Do you have OverWeight?:");
	String overweight=br.readLine();
	if(hypertension.equalsIgnoreCase("no") || bp.equalsIgnoreCase("no") || bs.equalsIgnoreCase("no") || overweight.equalsIgnoreCase("yes"))
	{
		double overweight1Per=(basepremium_age32*1)/100;
		basepremium_age32=(basepremium_age32+overweight1Per);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\tAfter increasing 1% for having OverWeight:"+basepremium_age32);
	}
	else if(hypertension.equalsIgnoreCase("no") || bp.equalsIgnoreCase("no") || bs.equalsIgnoreCase("yes") || overweight.equalsIgnoreCase("no"))
	{
		double bloodsugar1Per=(basepremium_age32*1)/100;
		basepremium_age32=(basepremium_age32+bloodsugar1Per);
		System.out.println("After increasing 1% for having Blood Sugar:"+basepremium_age32);
	}
	else if(hypertension.equalsIgnoreCase("no") || bp.equalsIgnoreCase("yes") || bs.equalsIgnoreCase("no") || overweight.equalsIgnoreCase("no"))
	{
		double bloodpressure1Per=(basepremium_age32*1)/100;
		basepremium_age32=(basepremium_age32+bloodpressure1Per);
		System.out.println("After increasing 1% for having Blood Pressure:"+basepremium_age32);
	}
	else if(hypertension.equalsIgnoreCase("yes") || bp.equalsIgnoreCase("no") || bs.equalsIgnoreCase("no") || overweight.equalsIgnoreCase("no"))
	{
		double hypertension1Per=(basepremium_age32*1)/100;
		basepremium_age32=(basepremium_age32+hypertension1Per);
		System.out.println("After increasing 1% for having Hypertension:"+basepremium_age32);
	}
	
	}
}
