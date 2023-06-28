package calculator;

public class LogCalculableFactor implements ICalculableFactory{
    Logger logger;
    public LogCalculableFactor(Logger logger) {
        this.logger = logger;
    }
    @Override
    public Calculable create(int primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logger);
    }
}
