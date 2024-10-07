package com.xworkz.fuctionalinterfaces.runner;

import java.util.function.*;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> consumer = (a) -> {
			System.out.println(a);
		};
		consumer.accept(5);

		BiConsumer<String, Integer> biConsumer = (a, b) -> {
			System.out.println(a+b);
		};
		biConsumer.accept("hi", 5);
		
		Supplier<Double> supplier=() -> {
			return 100.00;
		};
		
		Function<Integer,String> function=(a)->{
			System.out.println(a);
			return "hello";
		};
		function.apply(4);
		
		BiFunction<Integer,String,Integer> biFunction=(a,b)->{
			System.out.println(a+b);
			return 8;
		};
		biFunction.apply(6, "charan");
		
		Predicate<String> predicate=(a)->{
			System.out.println(a);
			return true;
		};
		predicate.test("Ajay");
		
		BiPredicate<Integer,String> biPredicate=(a,b)->{
			System.out.println(a+b);
			return true;
		};
		biPredicate.test(2, "sachin");
		
		UnaryOperator<String> operator=(a)->{
			
			return "Hi";
		};
		IntConsumer consumer2=(a)->{
			return;
			
		};
		IntSupplier intSupplier=()->{
			return 3;
		};
		IntFunction<String> function2=(a)->{
			return "x";
		};
		IntPredicate intPredicate=(a)->{
			return false;
		};
		IntUnaryOperator intUnaryOperator=(a)->{
			return 5;
		};
		IntBinaryOperator binaryOperator=(a,b)->{
			return 7;
		};
		LongSupplier longSupplier=()->{
			return 1L;
		};
		
		LongFunction<Integer> function3=(a)->{
			return 2;
		};
		
		LongPredicate longPredicate=(a)->{
			return false;
		};
		LongUnaryOperator longUnaryOperator=(a)->{
			return 2L;
		};
		LongBinaryOperator binaryOperator1 =(a,b)->{
			return 3L;
		};
		
		DoubleConsumer consumer3=(b)->{
			return;
		};
		DoubleSupplier doubleSupplier=()->{
			return 10.00;
		};
		
		DoubleFunction<Integer> doubleFunction=(a)->{
			return 3;
		};
		
		BinaryOperator<Integer> binaryOperator2=(a,b)->{
			return 3;
		};
		DoublePredicate doublePredicate=(a)->{
			return false;
		};
		DoubleUnaryOperator doubleUnaryOperator=(a)->{
			return 3.00;
		};
		
		DoubleBinaryOperator binaryOperator3=(a,b)->{
			return 5.00;
		};
		
		ToIntFunction<Integer> function4=(d)->{
			return 4;
		};
		ToDoubleFunction<String> doubleFunction2=(g)->{
			return 3.00;
		};
		ToLongFunction<Integer> function5=(g)->{
			return 8L;
		};
		ToIntBiFunction<Integer, Integer> biFunction2=(a,b)->{
			return 3;
		};
		ToDoubleBiFunction<String,String> biFunction3=(a,b)->{
			return 3.00;
		};
		ToLongBiFunction<Integer,String> biFunction4=(a,b)->{
			return 3L;
		};
		ObjIntConsumer<String> consumer4=(a,b)->{
			return;
		};
		ObjDoubleConsumer<Integer> consumer5=(a,b)->{
			return;
		};
		ObjLongConsumer<Long> consumer6=(a,c)->{
			return;
		};
		IntToDoubleFunction doubleFunction3=(a)->{
			return 8.00;
		};
		IntToLongFunction function6=(a)->{
			return 5L;
		};
		DoubleToIntFunction doubleToIntFunction=(d)->{
			return 2;
		};
		LongToIntFunction function7=(l)->{
			return 9;
			
		};
		DoubleToLongFunction doubleToLongFunction=(d)->{
			return 10L;
		};
		LongToDoubleFunction doubleFunction4=(k)->{
			return 10.00;
		};
		
	}

}
