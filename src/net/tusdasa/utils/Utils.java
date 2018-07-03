package net.tusdasa.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Utils {

	public static String getTime() {
		Date day = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(day);
	}
	
	public static String getRandom() {
		Random random = new Random();
		String fourRandom= String.valueOf(random.nextInt(100000));
		 int randLength = fourRandom.length();
	        if(randLength<4){
	          for(int i=1; i<=4-randLength; i++)
	              fourRandom = "0" + fourRandom;
	      }
	        return fourRandom;
	    }
	
	/**
	public static void main(String[] args) {
		System.out.println(Utils.getRandom());
	}
   */
}
