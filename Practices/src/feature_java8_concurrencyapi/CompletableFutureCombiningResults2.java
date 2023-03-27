package feature_java8_concurrencyapi;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class CompletableFutureCombiningResults2 {
	public static void main(String[] args) {
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 50);
		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 40);
		CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> 30);

		Optional<Integer> minElement = Stream.of(future1, future2, future3).map(CompletableFuture::join)
				.min(Integer::compareTo);
		System.out.println("The max element is " + minElement);
	}

}
