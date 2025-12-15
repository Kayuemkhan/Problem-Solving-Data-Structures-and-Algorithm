package OOP;

public final class User {  // final class - cannot be subclassed
    private  String name;    // final - cannot be changed
    private  int age;        // final - cannot be changed
    private  String email;   // final - cannot be changed
    
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    
    // Only getters, no setters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}



