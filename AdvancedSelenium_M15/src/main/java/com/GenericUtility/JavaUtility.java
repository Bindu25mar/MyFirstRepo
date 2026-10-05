
package com.GenericUtility;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class JavaUtility {
	
	/**
	 * this method is used to generate local date and time
	 * @return
	 */
	
	public String timeStamp() {
		String time=LocalDateTime.now().toString().replace(":", "_");
		return time;
		
		
	}
	/**
	 * this method is used to generate random number
	 * @return
	 */
	public int generateRandomNumber(){
		
		Random random=new Random();
		int randomvalue= random.nextInt(18900000);
		
		return randomvalue;
		
	}
	/**
	 * this method is used to generate random String data
	 * @return
	 */
	public String generateRandomData() {
		
		String data=UUID.randomUUID().toString().replace("[^a-zA-Z", "");
		return data;
	}
		
		
	
	}


