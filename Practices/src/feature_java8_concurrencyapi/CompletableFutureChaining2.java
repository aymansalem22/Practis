package feature_java8_concurrencyapi;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureChaining2 {

	public static void main(String[] args) {
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
				System.out.println(Thread.currentThread().getName());
			} catch (Exception e) {
				throw new IllegalStateException(e);
			}
			return 50;
		});

		CompletableFuture<Integer> resultFuture = future.thenCombine(CompletableFuture.supplyAsync(() -> 20),
				(num1, num2) -> num1 + num2);

		try {
			System.out.println(resultFuture.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}

}
