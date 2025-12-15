

<h1>Problems with God Class</h1>

[GodCalculator.java](GodCalculator.java)


1. Scattered State

   `javastatic double result1 = 0;` <br>
  ` static double result2 = 0;` <br>
   `static double result3 = 0;`<br>
   `static String lastOperation = "";`<br>
   `static double[] history = new double[100];`<br>
   **Issue: State is all over the place. Hard to track what belongs together.<br>**
   <br>
2. No Reusability
   javaadd(5, 3, 1);  // User A
   multiply(4, 2, 1);  // User B overwrites User A's result!
   Issue: Can't have multiple calculators running independently.
3. God Functions Do Everything
   java public static void chainOperations(double start, int slot) {
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



public class User {
String name;
int age;

    // Copy constructor
    public User(User other) {
        this.name = other.name;
        this.age = other.age;
    }
    
    // Or clone method
    public User clone() {
        return new User(this.name, this.age);
    }
}

// Usage:
User original = new User("Alice", 25);
List<User> users = new ArrayList<>();

users.add(new User(original));  // Add a COPY, not the original
// Or:
users.add(original.clone());    // Add a CLONE

original.setAge(30);
System.out.println(users.get(0).getAge());  // Still 25 (different object!)
```

**Memory with cloning:**
```
original ─────────> <br>
┌─────────────────────────┐<br>
│ User @ 0x1A2B           │<br>
│ name: "Alice"           │<br>
│ age: 30                 │<br>
└─────────────────────────┘<br>

users[0] ──────────> ┌─────────────────────────┐
│ User @ 0x5F6G (COPY!)   │
│ name: "Alice"           │
│ age: 25                 │
└─────────────────────────┘

TWO separate objects!
