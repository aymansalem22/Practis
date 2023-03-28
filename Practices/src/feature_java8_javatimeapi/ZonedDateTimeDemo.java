package feature_java8_javatimeapi;

import java.time.ZoneId;
import java.util.Set;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.of("America/Marigot");
		System.out.println("Zone Id " + zoneId);
		// Europe/Madrid
		Set<String> zoneIdList = ZoneId.getAvailableZoneIds();
		for (String zone : zoneIdList) {
			System.out.println(zone);
		}

	}

}
