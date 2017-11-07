package sample;

import java.io.IOException;

public class CalculateHealthInsurancePremium {

	public static void main(String[] args) throws IOException {
		UserDetails user_details=new UserDetails();
		UserHealthDetails user_healthdetails=new UserHealthDetails();
		UserGoodHabits user_goodhabits=new UserGoodHabits();
		UserBadHabits user_badhabits=new UserBadHabits();
		user_details.getUserData();
		user_healthdetails.getCurrentHealthDetails();
		user_goodhabits.getUserGoodHabits();
		user_badhabits.getUserBadHabits();
		
		
	}
}
