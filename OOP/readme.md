<h1>Problems with God Class</h1>

1. Scattered State
   javastatic double result1 = 0;
   static double result2 = 0;
   static double result3 = 0;
   static String lastOperation = "";
   static double[] history = new double[100];
   Issue: State is all over the place. Hard to track what belongs together.

2. No Reusability
   javaadd(5, 3, 1);  // User A
   multiply(4, 2, 1);  // User B overwrites User A's result!
   Issue: Can't have multiple calculators running independently.
3. God Functions Do Everything
   javapublic static void chainOperations(double start, int slot) {
   add(start, 10, slot);
   double temp = getFromSlot(slot);
   multiply(temp, 2, slot);
   temp = getFromSlot(slot);
   subtract(temp, 5, slot);
   }
   Issue: Single function doing too much. Hard to test, maintain, extend.
4. No Encapsulation
   javaresult1 = 999;  // Anyone can break the state!
   Issue: No protection. No validation. Data exposed everywhere.
5. Tight Coupling
   All functions depend on global state. Change one thing, break everything.