package feature_java8_concurrencyapi;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFutureDemo {

	public static Future<Integer> getSquareAsynchronously(int num) throws InterruptedException {
		CompletableFuture<Integer> completableFuture = new CompletableFuture<>();
		Executors.newCachedThreadPool().submit(() -> {
			Thread.sleep(500);
			completableFuture.complete(num * num);
			return completableFuture;
		});
		return completableFuture;
//		CompletableFuture<String> completableFuture2=CompletableFuture.completedFuture("Hello World");
//		return completableFuture2;
		// return completableFuture;
	}

	public static void main(String[] args) {
		CompletableFuture<String> completableFuture = CompletableFuture.completedFuture("Hello World");
		try {
			System.out.println(completableFuture.get());
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println(CompletableFutureDemo.getSquareAsynchronously(4));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
