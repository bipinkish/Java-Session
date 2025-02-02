package Functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Functions_ {
    public static void main(String[] args) {
        int input = 2;
        int ans = incrementByOneWithFunction
                .andThen(multiplyBy10)
                .apply(input);

        ans = addBy1AndMultipleByWithBiFunction.apply(2,100);

        System.out.println(ans);
    }

    static int incrementByOne(int val){
        return val+1;
    }

    // Takes 1 argument and produces 1 result
    static Function<Integer, Integer> incrementByOneWithFunction = val -> val + 1;

    static Function<Integer, Integer> multiplyBy10 = val -> val * 10;

    static int addBy1AndMultipleBy(int val1, int val2){
        return (val1+1) * val2;
    }

    // Takes 2 argument and produces 1 result
    static BiFunction<Integer, Integer, Integer> addBy1AndMultipleByWithBiFunction = (val1, val2) -> (val1+1) * val2;

}
