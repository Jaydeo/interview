package org.designpattern.creational.builder;

 class User {
    private final String name;
    private final int age;
    private final String email;
    private final String phone;

    public User(String name, int age, String email, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

     // Step 2: Static Builder Class
     public static class UserBuilder {
         private final String name; // Required
         private int age;           // Optional
         private String email;      // Optional
         private String phone;      // Optional

         // Constructor with required parameters
         public UserBuilder(String name) {
             this.name = name;
         }

         // Setters return 'this' for method chaining
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
         public User build(){
             return new User(name,age,email,phone);
         }

         // Step 3: Override toString() to print user details
     }


     @Override
     public String toString() {
         return "User{name='" + name + "', age=" + age + ", email='" + email + "', phone='" + phone + "'}";
     }


     public static void main(String[] args) {
         User user = new User.UserBuilder("John Doe")
                 .setAge(30)
                 .setEmail("john.doe@example.com")
                 .setPhone("1234567890")
                 .build();

         System.out.println(user);
     }
}
