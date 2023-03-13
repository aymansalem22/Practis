package P5_Collections_EnumMap;

import java.util.EnumMap;

public class Subjects {

	enum Subject {
		MATHS, SCIENCE, PROGRAMMING, ECONOMICS
	};

	public static void main(String[] args) {
		EnumMap<Subject, Integer> map = new EnumMap<>(Subject.class);
		map.put(Subject.MATHS, 50);
		map.put(Subject.SCIENCE, 60);
		map.put(Subject.PROGRAMMING, 70);
		map.forEach((key, value) -> {
			System.out.println(key + " - " + value);
		});
	}
}
