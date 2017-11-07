package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HealthInsurancePremium {

		double basepremium_age17=5000;
		double basepremium_age22=basepremium_age17+((basepremium_age17*10)/100);
		double basepremium_age27=basepremium_age22+((basepremium_age22*10)/100);
		double basepremium_age32=basepremium_age27+((basepremium_age27*10)/100);
		double basepremium_age37=basepremium_age32+((basepremium_age32*20)/100);
		double total;
		
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
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
		

	public static void main(String[] args) throws IOException {
		HealthInsurancePremium user=new HealthInsurancePremium();
		user.getUserData();
		user.getCurrentHealthDetails();
		user.getUserGoodHabits();
		user.getUserBadHabits();
	
	}
}
