package study05.sec03;

import java.util.function.BiFunction;

public class Function {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bi = (a,b) -> (a+b);
		
		int result = bi.apply(10, 20);
		System.out.println(result);
	}
}

