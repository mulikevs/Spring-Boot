package com.mulikevs.test.sbet.clr.fizzbuzz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FizzBuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);
	}

    @Bean
    public CommandLineRunner run(){
        return args ->{
            int n = 100;
            for (int i=1; i<=n; i++)
            {
                // divisible by 15
                if (i%15==0)
                    System.out.print("FizzBuzz"+" ");
                    // divisible by 5, print 'Buzz'
                else if (i%5==0)
                    System.out.print("Buzz"+" ");
                    // divisible by 3, print 'Fizz'
                else if (i%3==0)
                    System.out.print("Fizz"+" ");

                else // print the numbers
                    System.out.print(i+" ");
            }

        };
    }
}
