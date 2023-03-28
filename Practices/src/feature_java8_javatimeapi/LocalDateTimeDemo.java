package feature_java8_javatimeapi;


import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo {


	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);

		System.out.println("getting specfic time -->");
		LocalDateTime specDate = LocalDateTime.of(2019, 05, 03, 12, 34);
		System.out.println(specDate);

		specDate = LocalDateTime.of(2019, Month.AUGUST, 03, 23, 34);
		System.out.println(specDate);

		System.out.println("Using parse --> ");
		LocalDateTime paDate = LocalDateTime.parse("2020-06-20T07:54:00");
		System.out.println(paDate);

		System.out.println("Given date plus -->");
		LocalDateTime givenDate = LocalDateTime.parse("2020-05-12T08:30:00").plusDays(4);
		System.out.println(givenDate);

		givenDate = LocalDateTime.parse("2020-05-12T08:30:00").plus(4, ChronoUnit.MONTHS);
		System.out.println(givenDate);

		givenDate = LocalDateTime.parse("2020-05-12T08:30:00").minusMonths(4);
		System.out.println(givenDate);

	}

}
