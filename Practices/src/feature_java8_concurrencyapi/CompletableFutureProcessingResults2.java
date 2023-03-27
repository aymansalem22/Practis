package feature_java8_concurrencyapi;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureProcessingResults2 {

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

		CompletableFuture<Integer> resultFuture = future.thenApplyAsync(num -> {
			System.out.println(Thread.currentThread().getName());
			return num * 2;
		});

		try {
			System.out.println(resultFuture.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}

}
