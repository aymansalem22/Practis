package P5_Collections_EnumMap;

import java.time.DayOfWeek;
import java.util.EnumMap;

public class EnumMapDemo {
	public static void main(String[] args) {
		EnumMap<DayOfWeek, Integer> enumMap = new EnumMap<>(DayOfWeek.class);
		enumMap.put(DayOfWeek.MONDAY, 5);
		enumMap.put(DayOfWeek.WEDNESDAY, 23);
		System.out.println(enumMap);
		System.out.println(enumMap.get(DayOfWeek.MONDAY));

		enumMap.remove(DayOfWeek.MONDAY);

		EnumMap<FRUITS, Integer> enumMap2 = new EnumMap<>(FRUITS.class);

		enumMap2.put(FRUITS.APPLE, 0);
		enumMap2.put(FRUITS.BANANA, 1);
		enumMap2.put(FRUITS.ORANGE, 2);
		enumMap2.entrySet().forEach(System.out::println);

	}
}
