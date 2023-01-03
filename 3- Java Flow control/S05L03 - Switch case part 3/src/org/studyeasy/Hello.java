package org.studyeasy;

public class Hello {
	public static void main(String[] args) {
		String name = "Editor";

		switch (name.toLowerCase()) {
		case "author":
			System.out.println("Chaand");
			break;
		case "team":
			System.out.println("Team StudyEasy");
			break;

		case "editor":
			System.out.println("Shabaz & Salim");
			break;
		default:
			System.out.println("Invalid entry");
			break;

		}

	}
}
