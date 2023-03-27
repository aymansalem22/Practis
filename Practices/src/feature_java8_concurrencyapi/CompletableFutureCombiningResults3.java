package feature_java8_concurrencyapi;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureCombiningResults3 {
	public static void main(String[] args) {
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 50);
		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 40);
		CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> 30);

		CompletableFuture<Object> firstCompletedFuture = CompletableFuture.anyOf(future1, future2, future3);
		try {
			System.out.println("The first completed future value is " + firstCompletedFuture.get());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Code that should be executed after any of the futures complete.");

	}

}
