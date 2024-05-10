import java.util.ArrayList;
import java.util.List;


public class AddPrimaryContactTest {

    public static void main(String[] args) {
        testeQueueableClass();
    }

    private static void testeQueueableClass() {
        List<Account> accounts = new ArrayList<>();

        for (int i = 0; i <= 50; i++) {
            Account account = new Account();
            account.setName("Teste");
            account.setBillingState("NY");
            accounts.add(account);
        }

        // Itera sobre a lista e imprime cada item
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
