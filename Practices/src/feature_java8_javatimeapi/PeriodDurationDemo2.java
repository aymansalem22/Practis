package feature_java8_javatimeapi;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class PeriodDurationDemo2 {

	public static void main(String[] args) {
		Duration duration = Duration.ofDays(1);
		System.out.println(duration.getSeconds() + " seconds");

		duration = Duration.ofHours(2);
		System.out.println(duration.getSeconds() + " seconds");

		duration = Duration.ofMinutes(23);
		System.out.println(duration.getSeconds() + " seconds");

		duration = Duration.of(1, ChronoUnit.HOURS);
		System.out.println(duration.getSeconds() + " seconds");

		System.out.println("difference between two values -->");

		Duration difDuration = Duration.between(LocalTime.parse("12:14"), LocalTime.parse("13:15"));
		System.out.println("The difference is " + difDuration.getSeconds() + " Seconds");

	}

}
