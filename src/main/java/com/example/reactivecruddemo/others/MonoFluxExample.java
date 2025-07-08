package com.example.reactivecruddemo.others;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxExample {
    public static void main(String[] args) {
        Mono<String> m1 = Mono.just("Hello");
        m1.subscribe(System.out::println);

        Flux<Integer> f1 = Flux.just(1,2,3,4);
        f1.subscribe(System.out::println);
        Mono<Object> mono = Mono.error(new RuntimeException("Exception"))
                .onErrorMap(e -> new CustomException("Custom Exception"));
      //  mono.subscribe(System.out::println);

    }
}
