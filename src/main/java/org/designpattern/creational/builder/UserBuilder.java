package org.designpattern.creational.builder;

public class UserBuilder {
    private String name;
    private int age;
    private String email;
    private String phone;

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public User build() {
        return new User(name, age, email, phone);
    }





    public static void main(String[] args) {
        User user = new UserBuilder()
                .setName("John Doe")
                .setAge(30)
                .setEmail("john@example.com")
                .setPhone("1234567890")
                .build();

        System.out.println(user);
    }
}
