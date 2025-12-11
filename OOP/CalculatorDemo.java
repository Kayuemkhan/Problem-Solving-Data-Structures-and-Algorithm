package OOP;

import java.util.ArrayList;
import java.util.List;

// 1. ENCAPSULATION - Each calculator has its own state
class BasicCalculator {
    private double result;  // Protected state
    
    public void add(double a, double b) {
        result = a + b;
    }
    
    public void subtract(double a, double b) {
        result = a - b;
    }
    
    public void multiply(double a, double b) {
        result = a * b;
    }
    
    public void divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        result = a / b;
    }
    
    public double getResult() {
        return result;
    }
    
    public void clear() {
        result = 0;
    }
}

// 2. INHERITANCE - Reuse basic calculator logic
class ScientificCalculator extends BasicCalculator {
    
    public void power(double base, double exp) {
        double result = Math.pow(base, exp);
        // Use inherited clear and then add
        clear();
        add(result, 0);
    }
    
    public void sqrt(double a) {
        if (a < 0) {
            throw new ArithmeticException("Negative square root");
        }
        double result = Math.sqrt(a);
        clear();
        add(result, 0);
    }
    
    public void sin(double angle) {
        double result = Math.sin(Math.toRadians(angle));
        clear();
        add(result, 0);
    }
    
    public void cos(double angle) {
        double result = Math.cos(Math.toRadians(angle));
        clear();
        add(result, 0);
    }
}

// 3. COMPOSITION - Calculator has a history, not scattered state
class HistoryCalculator extends BasicCalculator {
    private List<Double> history;  // Encapsulated history
    
    public HistoryCalculator() {
        history = new ArrayList<>();
    }
    
    @Override
    public void add(double a, double b) {
        super.add(a, b);
        history.add(getResult());
    }
    
    @Override
    public void subtract(double a, double b) {
        super.subtract(a, b);
        history.add(getResult());
    }
    
    @Override
    public void multiply(double a, double b) {
        super.multiply(a, b);
        history.add(getResult());
    }
    
    @Override
    public void divide(double a, double b) {
        super.divide(a, b);
        history.add(getResult());
    }
    
    public List<Double> getHistory() {
        return new ArrayList<>(history);  // Return copy, not reference
    }
    
    public void clearHistory() {
        history.clear();
    }
    
    public void printHistory() {
        System.out.println("=== History ===");
        for (int i = 0; i < history.size(); i++) {
            System.out.println(i + ": " + history.get(i));
        }
    }
}

// 4. SINGLE RESPONSIBILITY - Each class does one thing well
class PercentageCalculator {
    public double calculate(double value, double percent) {
        return (value * percent) / 100;
    }
    
    public double addPercentage(double value, double percent) {
        return value + calculate(value, percent);
    }
    
    public double subtractPercentage(double value, double percent) {
        return value - calculate(value, percent);
    }
}

// 5. POLYMORPHISM - Different calculators, same interface
interface Calculator {
    double calculate();
    void clear();
}

class SimpleAddCalculator implements Calculator {
    private double a, b;
    
    public SimpleAddCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public double calculate() {
        return a + b;
    }
    
    @Override
    public void clear() {
        a = 0;
        b = 0;
    }
}

class SimpleMultiplyCalculator implements Calculator {
    private double a, b;
    
    public SimpleMultiplyCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public double calculate() {
        return a * b;
    }
    
    @Override
    public void clear() {
        a = 0;
        b = 0;
    }
}

// Main demonstration
public class CalculatorDemo {
    public static void main(String[] args) {
        System.out.println("=== PROBLEM SOLVED: Multiple Independent Calculators ===");
        BasicCalculator calc1 = new BasicCalculator();
        BasicCalculator calc2 = new BasicCalculator();
        
        calc1.add(5, 3);
        calc2.multiply(4, 2);
        
        System.out.println("Calc1: " + calc1.getResult());  // 8
        System.out.println("Calc2: " + calc2.getResult());  // 8
        // No interference!
        
        System.out.println("\n=== PROBLEM SOLVED: Inheritance & Reusability ===");
        ScientificCalculator sciCalc = new ScientificCalculator();
        sciCalc.power(2, 8);
        System.out.println("2^8 = " + sciCalc.getResult());
        
        sciCalc.sqrt(16);
        System.out.println("√16 = " + sciCalc.getResult());
        
        System.out.println("\n=== PROBLEM SOLVED: Encapsulated History ===");
        HistoryCalculator histCalc = new HistoryCalculator();
        histCalc.add(10, 5);
        histCalc.multiply(3, 4);
        histCalc.subtract(20, 8);
        histCalc.printHistory();
        
        System.out.println("\n=== PROBLEM SOLVED: Single Responsibility ===");
        PercentageCalculator percentCalc = new PercentageCalculator();
        System.out.println("15% of 200 = " + percentCalc.calculate(200, 15));
        System.out.println("200 + 15% = " + percentCalc.addPercentage(200, 15));
        
        System.out.println("\n=== PROBLEM SOLVED: Polymorphism ===");
        Calculator[] calculators = {
            new SimpleAddCalculator(10, 20),
            new SimpleMultiplyCalculator(5, 6)
        };
        
        for (Calculator calc : calculators) {
            System.out.println("Result: " + calc.calculate());
        }
    }
}