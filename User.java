package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class User {

	double basepremium_age17=5000;
	double basepremium_age22=basepremium_age17+((basepremium_age17*10)/100);
	double basepremium_age27=basepremium_age22+((basepremium_age22*10)/100);
	double basepremium_age32=basepremium_age27+((basepremium_age27*10)/100);
	double basepremium_age37=basepremium_age32+((basepremium_age32*20)/100);
	double total;
	
	InputStreamReader is=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(is);
}
