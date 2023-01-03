package org.studyeasy;

import org.studyeasy.laptop.Laptop;

public class Hello {

	public static void main(String[] args) {
		Laptop lappy = new Laptop();
		System.out.println(lappy.getProcessor().getBrand());

	}

}
