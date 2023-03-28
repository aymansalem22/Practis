package feature_java8_javatimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo2 {

	public static void main(String[] args) {
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);

		ZoneId zoneId = ZoneId.of("Canada/Atlantic");
		zonedDateTime = ZonedDateTime.of(2020, 10, 15, 23, 45, 59, 1234, zoneId);
		System.out.println(zonedDateTime);

	}

}
