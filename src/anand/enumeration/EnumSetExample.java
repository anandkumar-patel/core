package anand.enumeration;

import java.util.EnumSet;

public class EnumSetExample {
	public static void main(String[] args) {
		// Create an EnumSet that contains all days of the week.
		EnumSet<Day> week = EnumSet.allOf(Day.class);

		// Print the values of an EnumSet.
		for (Day d : week)
			System.out.println(d.name());

		System.out.println(week.size());

		// Remove a Day object.
		week.remove(Day.FRIDAY);
		System.out.println("After removing Day.FRIDAY, size: " + week.size());

		// Insert a Day object.
		week.add(Day.valueOf("FRIDAY"));
		System.out.println("Size is now: " + week.size());
	}
}
