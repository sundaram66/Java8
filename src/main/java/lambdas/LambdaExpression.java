package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class LambdaExpression {

    public interface Function<T, R> {
        R apply(T t);
     }
    
    public static void main(String[] args) {

        final String[] strArray = {"Hello", "test"};

        Runnable runnable1 = () -> System.out.println("Runnable 1 : line 1");
        runnable1.run();

        Runnable runnable2 = () -> {
            System.out.println("Runnable 2 : Line 1");
            System.out.println("Runnable 2 : Line 2");
        };
        runnable2.run();

        BinaryOperator<Long> add = (x, y) -> x + y;
        System.out.println("Add Binary Op Lambda : " + add.apply(3L, 4L));

        Predicate<Integer> predicate = x -> x % 2 == 0;
        System.out.println("Odd or Even: " + predicate.test(3));
        
        Function<Integer,Long> func = x->x*2L;
        System.out.println("Func Interface: " + func.apply(3));
        

    }

}
