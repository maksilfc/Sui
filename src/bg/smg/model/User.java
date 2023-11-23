package bg.smg.model;
import  java.util.ArrayList;
import java.util.List;
public class User {
    private String username;
    private String password;
    private List<Account> bankAccounts;

    public User(String username, String password, List<Account> bankAccounts) {
        this.username = username;
        this.password = password;
        this.bankAccounts = bankAccounts;
    }

    public User() {
        this.username = "";
        this.password = "";
        this.bankAccounts = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Account> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<Account> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
