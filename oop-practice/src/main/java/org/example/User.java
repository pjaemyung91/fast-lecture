package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();  // as-is
        String password = passwordGenerator.generatePassword();                             // to-be
        if(password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
