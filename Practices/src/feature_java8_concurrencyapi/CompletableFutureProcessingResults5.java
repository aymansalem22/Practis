package feature_java8_concurrencyapi;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureProcessingResults5 {
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

		future.thenRun(() -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Hello");
		});
	}

}
