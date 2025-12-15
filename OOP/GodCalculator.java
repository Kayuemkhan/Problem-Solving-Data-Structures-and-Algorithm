package OOP;

public class GodCalculator {
    // Scattered global state - nightmare to manage
    static double result1 = 0;
    static double result2 = 0;
    static double result3 = 0;
    static String lastOperation = "";
    static double[] history = new double[100];
    static int historyIndex = 0;
    
    // Basic operations
    public static void add(double a, double b, int resultSlot) {
        double res = a + b;
        saveToSlot(res, resultSlot);
        lastOperation = "ADD";
        addToHistory(res);
    }
    
    public static void subtract(double a, double b, int resultSlot) {
        double res = a - b;
        saveToSlot(res, resultSlot);
        lastOperation = "SUBTRACT";
        addToHistory(res);
    }
    
    public static void multiply(double a, double b, int resultSlot) {
        double res = a * b;
        saveToSlot(res, resultSlot);
        lastOperation = "MULTIPLY";
        addToHistory(res);
    }
    
    public static void divide(double a, double b, int resultSlot) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return;
        }
        double res = a / b;
        saveToSlot(res, resultSlot);
        lastOperation = "DIVIDE";
        addToHistory(res);
    }
    
    // Advanced operations
    public static void power(double base, double exp, int resultSlot) {
        double res = Math.pow(base, exp);
        saveToSlot(res, resultSlot);
        lastOperation = "POWER";
        addToHistory(res);
    }
    
    public static void sqrt(double a, int resultSlot) {
        if (a < 0) {
            System.out.println("Error: Negative square root");
            return;
        }
        double res = Math.sqrt(a);
        saveToSlot(res, resultSlot);
        lastOperation = "SQRT";
        addToHistory(res);
    }
    
    public static void percentage(double value, double percent, int resultSlot) {
        double res = (value * percent) / 100;
        saveToSlot(res, resultSlot);
        lastOperation = "PERCENTAGE";
        addToHistory(res);
    }
    
    // Trigonometry
    public static void sin(double angle, int resultSlot) {
        double res = Math.sin(Math.toRadians(angle));
        saveToSlot(res, resultSlot);
        lastOperation = "SIN";
        addToHistory(res);
    }
    
    public static void cos(double angle, int resultSlot) {
        double res = Math.cos(Math.toRadians(angle));
        saveToSlot(res, resultSlot);
        lastOperation = "COS";
        addToHistory(res);
    }
    
    // Memory management - confusing!
    public static void saveToSlot(double value, int slot) {
        switch(slot) {
            case 1: result1 = value; break;
            case 2: result2 = value; break;
            case 3: result3 = value; break;
            default: result1 = value;
        }
    }
    
    public static double getFromSlot(int slot) {
        switch(slot) {
            case 1: return result1;
            case 2: return result2;
            case 3: return result3;
            default: return result1;
        }
    }
    
    public static void clearSlot(int slot) {
        saveToSlot(0, slot);
    }
    
    public static void clearAll() {
        result1 = 0;
        result2 = 0;
        result3 = 0;
        lastOperation = "";
        historyIndex = 0;
    }
    
    // History management
    public static void addToHistory(double value) {
        if (historyIndex < history.length) {
            history[historyIndex++] = value;
        }
    }
    
    public static void printHistory() {
        System.out.println("=== History ===");
        for (int i = 0; i < historyIndex; i++) {
            System.out.println(i + ": " + history[i]);
        }
    }
    
    public static void clearHistory() {
        historyIndex = 0;
    }
    
    // Complex operations mixing everything
    public static void chainOperations(double start, int slot) {
        add(start, 10, slot);
        double temp = getFromSlot(slot);
        multiply(temp, 2, slot);
        temp = getFromSlot(slot);
        subtract(temp, 5, slot);
    }
    
    public static void main(String[] args) {
        // Problem 1: Confusing state management
//        add(5, 3, 1);
//        multiply(4, 2, 2);
//        System.out.println("Slot 1: " + getFromSlot(1)); // 8
//        System.out.println("Slot 2: " + getFromSlot(2)); // 8
//
//        // Problem 2: Can't have independent calculators
//        // Everything shares the same global state!
//
//        // Problem 3: Operations accidentally overwrite each other
//        add(10, 20, 1);
//        System.out.println("Slot 1: " + getFromSlot(1)); // 30 - lost previous value!
//
//        // Problem 4: No encapsulation - anyone can mess with state
//        result1 = 999; // Direct access - breaks everything
//
//        printHistory();
//        clearAll();

        User myUser = createUser();
        myUser.setAge(40);
        System.out.println(myUser.getAge());


    }
    public static User createUser() {
        User localUser = new User("Charlie", 35,"a@me.com");
        return localUser;
    }
}