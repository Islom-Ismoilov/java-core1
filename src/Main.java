import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        // HomeTask 1
        int[] arr2 = {1,4,3,2};
        Arrays.sort(arr2);

        boolean isSorted = true;
        for (int s = 1; s < arr2.length; s ++){
            if (arr2[s] < arr2[s - 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(arr2.length);
        for (int l = 0; l < arr2.length; l++){
            System.out.print(arr2[l]);
            if (l < arr2.length - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(isSorted);


        // HomeTask 2

        //Implementation 1
        String stringToReverse = "]gnirts siht esrever lliw I[";
        StringBuilder reversedString = new StringBuilder(stringToReverse);
        reversedString.reverse();
        System.out.println("\n" + reversedString.toString());

        //Implementation 2
        String stringToReverse1 = "]2 gnirts siht esrever lliw I[";
        StringBuilder reversedString2 = new StringBuilder();

        for (int i = stringToReverse1.length() - 1; i>= 0; i--){
            reversedString2.append(stringToReverse1.charAt(i));
        }
        System.out.println("\n" + reversedString2.toString());

        //Implementation 3


        //HomeTask 3
        System.out.println("\n");

        Person person1 = new Person("Jack", 23);
        Person person2 = new Person("Nicky", 33);

        System.out.println("Person 1: " + person1.getName() + ", " + person1.getAge());
        System.out.println("Person 2: " + person2.getName() + ", " + person2.getAge());

        //Swapping

        System.out.println("\n" + "Swapping: " + "\n");

        MakeChanges.ChangeIdentities(person1, person2);

        System.out.println("Person 1: " + person1.getName() + ", " + person1.getAge());
        System.out.println("Person 2: " + person2.getName() + ", " + person2.getAge());

        // HomeTask 4
        User user = new User(3,"Ras", "Taman");
        Account accountUser = new Account(2,300L, user);

        Account [] accounts = {new Account(1,230L, new User(1,"Artem", "Salar"))};
        System.out.println(Arrays.toString(accounts));

        AccountService service = new AccountServiceImpl(accounts);

        Account account = service.findAccountByOwnerId(10L);
        if (account != null) {
            System.out.println("Account found: " + account.getId());
        }else {
            System.out.println("Account not found.");
        }

        long count = service.countAccountWithBalanceGreaterThan(1000L);
        System.out.println("Number of accounts with balance greater than 1000: " + count);

    }
}
