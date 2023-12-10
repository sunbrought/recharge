package org.sunbrought.DesignModel.jianzaozhe;

public class MainStart {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setName("John")
                .setEmail("john@example.com")
                .setAge(30)
                .build();
        System.out.println(user.toString());
    }
}
