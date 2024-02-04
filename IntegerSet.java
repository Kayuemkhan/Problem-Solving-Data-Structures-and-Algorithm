import java.util.Arrays;

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
        int[] a = {1,2,3,4};
        int[] b = a;
        a[0] = 4;

        System.out.println(Arrays.toString(b));

    }
}