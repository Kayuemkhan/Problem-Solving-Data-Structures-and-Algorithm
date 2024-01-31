public class IntegerSet {

    private final boolean[] integerSet;

    // no argument constructor
    public IntegerSet() {
       // Array size for integers 0-100
        integerSet = new boolean[101];
    }

    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i < resultSet.integerSet.length; i++) {
            resultSet.integerSet[i] = set1.integerSet[i] || set2.integerSet[i];
        }
        return resultSet;
    }

    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i < resultSet.integerSet.length; i++) {
            resultSet.integerSet[i] = set1.integerSet[i] && set2.integerSet[i];
        }
        return resultSet;
    }

    public void insertElement(int k) {
        if (k >= 0 && k <= 100) {
            integerSet[k] = true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = true;
        for (int i = 0; i < integerSet.length; i++) {
            if (integerSet[i]) {
                sb.append(i).append(" ");
                isEmpty = false;
            }
        }
        if (isEmpty) {
            return "---";
        } else {
            return sb.toString().trim();
        }
    }

    public boolean isEqualTo(IntegerSet otherSet) {
        for (int i = 0; i < integerSet.length; i++) {
            if (integerSet[i] != otherSet.integerSet[i]) {return false;}
        }
        return true;
    }

    public static void main(String[] args) {
        IntegerSet integerSet = new IntegerSet();
        IntegerSet integerSet1 = new IntegerSet();

        integerSet.insertElement(5);
        integerSet.insertElement(10);
        integerSet.insertElement(20);
        integerSet1.insertElement(10);
        integerSet1.insertElement(15);
        integerSet1.insertElement(20);

        System.out.println("Set 1: " + integerSet);
        System.out.println("Set 2: " + integerSet1);
        IntegerSet unionSet = IntegerSet.union(integerSet, integerSet1);
        System.out.println("Union of integerSet and integerSet1: " + unionSet);

        IntegerSet intersectionSet = IntegerSet.intersection(integerSet, integerSet1);
        System.out.println("Intersection of integerSet and integerSet1: " + intersectionSet);
        System.out.println("Is integerSet equal to integerSet1? " + integerSet.isEqualTo(integerSet1));
    }
}