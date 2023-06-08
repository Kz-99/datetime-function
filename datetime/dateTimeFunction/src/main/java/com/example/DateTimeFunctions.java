package com.example;
import java.time.*;
public class DateTimeFunctions {
	/*
	 * Update the class and existing methods as necessary to perform the required calculations
	 * and return the expected results.
	 *
	 * - All code should be inside the placeholders provided.
	 * - Do not add code outside of the placeholders.
	 * - Do not change code except as required inside the placeholders.
	 *	    //YOUR CODE STARTS HERE
	 *
	 *		//YOUR CODE ENDS HERE
	 */
	/*
	 * Implement the method so that it returns today's date.
	 */
	public static LocalDate getTodaysDate() {
		//YOUR CODE STARTS HERE

		//Returns an object which represents the current date,
		// which is based on the clock of whatever system the code is running on, laptop, computer etc.
		return LocalDate.now();
		//YOUR CODE ENDS HERE
	}
	/*
	 * Implement the method so that it returns the date x days after
	 * the input date.
	 */
	public static LocalDate getLaterDatebyDays(LocalDate date, int x) {
		//YOUR CODE STARTS HERE
		//returns a new LocalDate object which is known as x days after the starting date.
		return date.plusDays(x);
		//YOUR CODE ENDS HERE
	}
	/*
	 * Implement the method so that it returns the date x weeks prior to
	 * the input date.
	 */
	public static LocalDate getPreviousDatebyWeeks(LocalDate date, int x) {
		//YOUR CODE STARTS HERE
		//returns new object which is known as x weeks before the starting date
		return date.minusWeeks(x);
		//YOUR CODE ENDS HERE
	}
	/*
	 * Implement the method so that it returns the time difference between two input dates
	 * in terms of years, months, and days.
	 * Return the String in the format: "Year-20:Months-5:Days-1"
	 */
	public static String getTimeDifference(LocalDate date1, LocalDate date2) {
		//Creates a variable called period, which reads the difference between the two dates
		Period period = Period.between(date1, date2);
		// Recieves the modulus of 7 which gets the remainder until after dividing by 7...
		// which are the number of days in a week
		int days = period.getDays() % 7;
		// Recieves the modulus of 12 which gets the remainder until after dividing by 12...
		// which are the number of months in a year
		long months = period.toTotalMonths() % 12;
		//Recieves the years
		int years = period.getYears();
		//Prints the Years, months and days in the same format as asked in the assessment page
		return String.format("Years-%d:Months-%d:Days-%d", years, months, days);
	}
		//YOUR CODE ENDS HERE
	public static void main(String[] args) {
		System.out.println("Today's date is: " + getTodaysDate());
		System.out.println("14 days from today is: " + getLaterDatebyDays(getTodaysDate(), 14));
		System.out.println("5 weeks prior to today was: " + getPreviousDatebyWeeks(getTodaysDate(), 5));
		System.out.println("The difference between today " +
				"and June 30, 2031 is: " +
				getTimeDifference(getTodaysDate(), LocalDate.of(2031,06,30)));
	}
}