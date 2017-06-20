import java.util.Arrays;
/**
 * Created by Skorodielov on 07.06.2017.
 */
public class DepositClient {
    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};

        withdraw(names, balances, "Denis", 8500);
        System.out.println(Arrays.toString(balances));
    }

    static int withdraw(String[] clients, int[] balances, String client, int amount){
        if (amount > balances[findClientIndexByName(clients, client)]){
            return balances[findClientIndexByName(clients, client)] = -1;
        }
       return balances[findClientIndexByName(clients, client)] -= amount;
    }

    static int findClientIndexByName(String[] clients, String client){
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client){
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }
}
