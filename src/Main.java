import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

         //HomeTask 1
        Scanner scanner = new Scanner(System.in);

        // Size of the array

        int numbers = scanner.nextInt();
        int [] array = new int[numbers];

        // Elements of array
        for (int i = 0; i < numbers; i++){
            array[i] = scanner.nextInt();
        }

        // Sorting array in ascending order
        boolean isSorted = true;
        for (int i = 1; i < numbers; i++){
            if (array[i] < array[i - 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
        scanner.close();



        // HomeTask 2

        //Implementation 1
        String stringToReverse = "]gnirts siht esrever lliw I[";
        StringBuilder reversedString = new StringBuilder(stringToReverse);
        reversedString.reverse();
        System.out.println("\n" + reversedString.toString());

        //Implementation 2
        String stringToReverse1 = "]2 gnirts siht esrever lliw I[";
        StringBuilder reversedString1 = new StringBuilder();

        for (int i = stringToReverse1.length() - 1; i>= 0; i--){
            reversedString1.append(stringToReverse1.charAt(i));
        }
        System.out.println("\n" + reversedString1.toString());

        //Implementation 3
        String stringToReverse2 = "]3 gnirts siht esrever lliw I[";
        int length = stringToReverse2.length();
        StringBuilder reversedString2 = new StringBuilder();

        for (int i = length - 1; i >= 0; i--){
            reversedString2.append(stringToReverse2.charAt(i));
        }
        System.out.println(reversedString2);

        //HomeTask 3
        System.out.println("\n");

        Person person1 = new Person("Jack", 23);
        Person person2 = new Person("Nicky", 33);

        System.out.println("Person 1: " + person1.getName() + ", " + person1.getAge());
        System.out.println("Person 2: " + person2.getName() + ", " + person2.getAge());

        //Swapping

        System.out.println("\n" + "Swapping: " + "\n");

        MakingChanges.changeIdentities(person1, person2);

        System.out.println("Person 1: " + person1.getName() + ", " + person1.getAge());
        System.out.println("Person 2: " + person2.getName() + ", " + person2.getAge());

        // HomeTask 4
        User user = new User(3,"Ras", "Taman");
        Account accountUser = new Account(2,300L, user);
        System.out.println(accountUser);

        Account [] accounts = {new Account(1,230L, new User(1,"Artem", "Salar"))};
        System.out.println(Arrays.toString(accounts));

        AccountService service = new AccountServiceImpl(accounts);

        Account account = service.findAccountByOwnerId(10L);
        if (account != null) {
            System.out.println("Account found: " + account.getId());
        }else {
            System.out.println("Account not found.");
        }

        long count = service.countAccountsWithBalanceGreaterThan(1000L);
        System.out.println("Number of accounts with balance greater than 1000: " + count);

    }
}
