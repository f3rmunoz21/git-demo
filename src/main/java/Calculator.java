import java.util.stream.DoubleStream;

public class Calculator {
    /**
     *
     * @param operands
     * @return
     */
    static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }

    /**
     * @param operands
     * @return
     */
    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }
}