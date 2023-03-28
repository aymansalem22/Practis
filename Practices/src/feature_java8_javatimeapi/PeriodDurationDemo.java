package feature_java8_javatimeapi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDurationDemo {

	public static void main(String[] args) {
		Period period = Period.ofDays(5);
		System.out.println(period.getDays());

		period = Period.ofMonths(3);
		System.out.println(period.getMonths());

		period = Period.ofYears(2);
		System.out.println(period.getYears());

		System.out.println("--------------------");
		period = Period.of(2, 5, 12);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());

		System.out.println("difference between two date --> ");
		Period difPeriod = Period.between(LocalDate.parse("2020-05-18"), LocalDate.parse("2017-04-17"));
		System.out.println(difPeriod);

		System.out.println("specfic difference  between two date --> ");
		Period specPeriod = Period.between(LocalDate.parse("2017-04-17"), LocalDate.parse("2020-05-18"));

		int years = specPeriod.getYears();
		int months = specPeriod.getMonths();
		int days = specPeriod.getDays();
		System.out.println(
				"The difference between two dates is " + years + " Years, " + months + " Months and " + days + " Days");

	}

}
