package com.functionalinterfaces;

import java.lang.reflect.Array;
import java.util.*;
import java.util.List.*;
import java.util.function.BinaryOperator;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> maxBy= (a, b) -> a >b ? a : b;
		int max=maxBy.apply(5,3);
		System.out.println("Maximum of 5 & 3 is: "+max);
		
        List<Integer> numbers = Arrays.asList(100, 20, 30, 70, 40); // Corrected Arrays.asList
		System.out.println("List of Integers: "+numbers);
		
		BinaryOperator<Integer> sumOperator= Integer::sum;
		Optional<Integer> sum=numbers.stream().reduce(sumOperator);
		sum.ifPresent(s -> System.out.println("Sum of Integers: "+s));
		
		BinaryOperator<Integer> minBy=BinaryOperator.minBy(Comparator.naturalOrder());
		Optional<Integer> min=numbers.stream().reduce(minBy);
		if(min.isPresent())
			System.out.println("Minimum of Integers: "+min.get());

	}

}
