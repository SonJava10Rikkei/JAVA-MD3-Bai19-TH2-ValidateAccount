package rikkei.academy;

import rikkei.academy.validate.AccountExample;

public class AccountExampleTest {
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "123456", "abcde"};
    private static AccountExample accountExample;

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("_ Account is " + account + " is valid ! " + isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("+ Account is " + account + " is valid ! " + isvalid);
        }
    }
}
