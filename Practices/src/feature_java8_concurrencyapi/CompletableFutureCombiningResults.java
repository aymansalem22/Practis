package feature_java8_concurrencyapi;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureCombiningResults {

	public static void main(String[] args) {
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 50);
		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 40);
		CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> 30);

		CompletableFuture<Void> finalFuture = CompletableFuture.allOf(future1, future2, future3);

		try {
			finalFuture.get();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Code that should be executed after all the futures complete.");

		System.out.println(finalFuture);

	}

}
