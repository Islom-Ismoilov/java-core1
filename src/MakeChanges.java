class MakeChanges {

    public static void ChangeIdentities(Person p1, Person p2){
        String SwName = p1.name;
        int SwAge = p1.age;

        // Sharing params of Person from p1 to p2
        p1.name = p2.name;
        p1.age = p2.age;

        p2.name = SwName;
        p2.age = SwAge;
    }
}
