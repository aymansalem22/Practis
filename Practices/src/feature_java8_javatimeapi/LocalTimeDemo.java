package feature_java8_javatimeapi;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);

		System.out.println("of() method --> ");
		LocalTime specTime = LocalTime.of(11, 25);
		System.out.println(specTime);

		specTime = LocalTime.of(11, 25, 03);
		System.out.println(specTime);

		specTime = LocalTime.of(11, 25, 03, 323);
		System.out.println(specTime);

		System.out.println("Using parse method -->");
		LocalTime paTime = LocalTime.parse("08:27");
		System.out.println(paTime);

		paTime = LocalTime.parse("08:27:44", DateTimeFormatter.ofPattern("HH:mm:ss"));
		System.out.println(paTime);

		System.out.println("adding time -> ");
		LocalTime addTime = LocalTime.parse("12:54:53").plusSeconds(4);
		System.out.println(addTime);

		addTime = LocalTime.parse("12:54:53").plusMinutes(10);
		System.out.println(addTime);

		addTime = LocalTime.parse("12:54:53").plusHours(2);
		System.out.println(addTime);

		addTime = LocalTime.parse("12:54:53").plus(4, ChronoUnit.MINUTES);
		System.out.println(addTime);

		System.out.println("getMinute() method -->");
		int minute = LocalTime.parse("07:45").getMinute();
		System.out.println(minute);

		System.out.println("Checking if time is before or after -->");
		boolean isBefore = LocalTime.parse("06:23").isBefore(LocalTime.parse("07:50"));
		System.out.println(isBefore);

		boolean isAfter = LocalTime.parse("06:23").isAfter(LocalTime.parse("07:50"));
		System.out.println(isAfter);

	}

}
