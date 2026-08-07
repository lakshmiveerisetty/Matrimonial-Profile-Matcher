package com.matrimonialprofilematcher;

import java.util.Scanner;

public class MatrimonialProfileMatcher {
	public static void main(String[] args) {
		System.out.println("========== MATRIMONIAL PROFILE VALIDATION SYSTEM ==========");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your full name: ");
		String fullName = sc.nextLine();

		System.out.println("Welcome, " + fullName);

		System.out.println("Please enter your profile details :");

		final double MIN_ASSETS = 50000000;
		final double MIN_SALARY = 2500000;

		System.out.print("Enter assets: ");
		double assets = sc.nextDouble();

		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();

		if (assets >= MIN_ASSETS && salary >= MIN_SALARY) {
			System.out.println("Financial eligibility criteria satisfied ");

			System.out.print("Enter your age: ");
			int age = sc.nextInt();

			if (age >= 26 && age <= 28) {
				System.out.println("Age criteria satisfied");

				System.out.print("Enter your height: ");
				float height = sc.nextFloat();

				if (height >= 5.6 && height <= 6.0) {
					System.out.println("Height criteria satisfied");

					System.out.print("Enter your weight: ");
					double weight = sc.nextDouble();

					if (weight >= 65 && weight <= 70) {
						System.out.println("Profile meets the initial eligibility criteria");

						System.out.print("Do you have siblings? (Yes/No): ");
						String siblings = sc.next();

						if (!siblings.equalsIgnoreCase("Yes") && !siblings.equalsIgnoreCase("No")) {
						    System.out.println("Invalid input! Please enter only Yes or No.");
						    sc.close();
						    return;
						}

						boolean hasSiblings = siblings.equalsIgnoreCase("Yes");
						
						if (!hasSiblings) {
							// Profile matched
							System.out.println("Congratulations! Your profile has been shortlisted for the next stage.");

							System.out.println("\n========== PROFILE SUMMARY ==========");
							System.out.println("Name      : " + fullName);
							System.out.println("Age       : " + age);
							System.out.println("Height    : " + height + " ft");
							System.out.println("Weight    : " + weight + " kg");
							System.out.printf("Assets    : %.2f%n", assets);
							System.out.printf("Salary    : %.2f%n", salary);
							System.out.println("Siblings  : " + (hasSiblings ? "Yes" : "No"));
							
							System.out.println("\n========== RESULT ==========");
							System.out.println("Status    : PROFILE MATCHED");
							System.out.println("Candidate : " + fullName);
							System.out.println("Thank you for using our system.");
						} else {
							System.out.println("Sorry! Profile does not meet the required criteria because the candidate has siblings.");
						}
					} else {
						System.out.println("Sorry! Weight does not meet the required criteria.");
					}

				} else {
					System.out.println("Sorry! Height does not meet the required criteria.");
				}

			} else {
				System.out.println("Sorry! Age does not meet the required criteria.");
			}
		} else {
			System.out.println("Sorry! Your profile is not eligible.");
			}

		sc.close();

	}

}
