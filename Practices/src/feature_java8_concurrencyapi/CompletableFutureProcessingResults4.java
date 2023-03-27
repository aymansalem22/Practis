package feature_java8_concurrencyapi;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureProcessingResults4 {

	public static void main(String[] args) {
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			return 50;
		});

		future.thenAccept(num -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("The value is " + num);
		});

	}

}
