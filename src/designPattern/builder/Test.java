package designPattern.builder;

public class Test {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setId("123")
                .setName("Test")
                .setEmail("test@example.com")
                .build();

        System.out.println(user);
    }
}