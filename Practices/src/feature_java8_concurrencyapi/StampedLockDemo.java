package feature_java8_concurrencyapi;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.StampedLock;

public class StampedLockDemo {

	static Map<String, Integer> data = new HashMap<>();
	static StampedLock lock = new StampedLock();

	public static Integer readDataFromMap(String key) {
		long stamp = lock.readLock();
		try {
			return data.get(key);
		} finally {
			lock.unlockRead(stamp);
		}
	}

	public static void writeDataToMap(String key, Integer value) {
		long stamp = lock.writeLock();
		try {
			data.put(key, value);
		} finally {
			lock.unlockWrite(stamp);
		}
	}

	public static void main(String[] args) {
		writeDataToMap("ray", 123);
		Integer val = readDataFromMap("ray");
		System.out.println(val);
	}

}
