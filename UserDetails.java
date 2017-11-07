package sample;

import java.io.IOException;

public class UserDetails extends User {

	public void getUserData() throws IOException
	{
		
	System.out.println();
	System.out.println();
	System.out.println("\t\t\t\t\t\t\t---------------------------------------");
	System.out.println("\t\t\t\t\t\t\t***Insurance Premium Calculation API***");
	System.out.println("\t\t\t\t\t\t\t---------------------------------------");
	System.out.println();
	System.out.println();
	System.out.println("\t\t\t\t\t\t\tBase Premium for anyone<18="+basepremium_age17);
	System.out.println("-------------------");
	System.out.println("User Details");
	System.out.println("-------------------");
	System.out.print("Enter Your Name:");
	String name=br.readLine();
	System.out.print("Enter Your Age:");
	int age=Integer.parseInt(br.readLine());
	if(age<18)
	{
		total=basepremium_age17;
		System.out.println("BasePremium for age<18 : "+total);	
	}
	else if(age==18 || age==19 || age==20 ||age==21 || age==22 || age==23 || age==24)
	{
		System.out.println("Base Premium for age>=18 or age<25 : "+basepremium_age22);
	}
	else if(age==25 || age==26 || age==27 || age==28 || age==29)
	{
	
		System.out.println("Base Premium for age>=25 or age<30 : "+basepremium_age27);
	}
	else if(age>=30 || age==31 || age==32 || age==33 || age==34)
	{
		
		System.out.println("Base Premium for age>=30 or age<35 : "+basepremium_age32);
	}
	else if(age==35 || age==36 || age==37 || age==38 || age==39)
	{
	
		System.out.println("Base Premium for age>=35 or age<40 : "+basepremium_age37);
	}
	System.out.println("Enter Your Gendor:");
	String gendor=br.readLine();
	if(gendor.equalsIgnoreCase("male") || gendor.equalsIgnoreCase("female") || gendor.equalsIgnoreCase("others"))
	{
		double gendor_rule=(basepremium_age32*2)/100;
		basepremium_age32=(basepremium_age32+gendor_rule);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\tAfter Applying Gendor Rule:"+basepremium_age32);
	}

	}

}
