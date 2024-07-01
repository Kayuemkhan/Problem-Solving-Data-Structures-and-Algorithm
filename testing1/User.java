package testing1;

import org.jetbrains.annotations.Nullable;

public class User {

    @Nullable
    private String firstName;
    @Nullable
    private String lastName;

    public User(@Nullable String firstName, @Nullable String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}