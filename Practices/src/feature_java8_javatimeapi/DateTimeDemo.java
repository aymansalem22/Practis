package feature_java8_javatimeapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);

		System.out.println("method of -->");
		LocalDate getDate = LocalDate.of(2019, 05, 03);
		System.out.println(getDate);

		getDate = LocalDate.of(2019, Month.AUGUST, 03);
		System.out.println(getDate);

		System.out.println("method parse -->");

		LocalDate specificDate = LocalDate.parse("2015-02-12");
		System.out.println(specificDate);

		specificDate = LocalDate.parse("12/02/2012", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		System.out.println(specificDate);

		System.out.println("given date -->");

		LocalDate givenDate = LocalDate.parse("2015-02-12").plusDays(5);
		System.out.println(givenDate);
		givenDate = LocalDate.parse("2017-03-28").plusYears(6);
		System.out.println(givenDate);
		givenDate = LocalDate.parse("2023-03-28").plus(5, ChronoUnit.MONTHS);
		System.out.println(givenDate);

		System.out.println("Getting day of week -->");
		DayOfWeek dayOfWeek = LocalDate.parse("2023-03-28").getDayOfWeek();
		System.out.println(dayOfWeek);

		System.out.println("check date is before or after -->");
		boolean isBefore = LocalDate.parse("2020-03-12").isBefore(LocalDate.parse("2018-06-14"));
		System.out.println(isBefore);

		boolean isAfter = LocalDate.parse("2020-03-12").isAfter(LocalDate.parse("2018-06-14"));
		System.out.println(isAfter);

	}

}
