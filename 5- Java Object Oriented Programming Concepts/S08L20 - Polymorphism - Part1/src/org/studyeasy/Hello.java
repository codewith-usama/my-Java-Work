package org.studyeasy;

import org.studyeasy.phone.Nokia3310;
import org.studyeasy.phone.Phone;
import org.studyeasy.phone.SamsungNote8;

public class Hello {

	public static void main(String[] args) {
		
		Phone note8 = new SamsungNote8("Note 8");
		System.out.println(note8.getModel());
		note8.features();
		
		
		
		Phone nokia3310 = new Nokia3310("Nokia 3310");
		System.out.println(nokia3310.getModel());
		nokia3310.features();
		
		
	}

}
