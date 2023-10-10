class MakingChanges {

    public static void changeIdentities(Person p1, Person p2){
        String swName = p1.name;
        int swAge = p1.age;

        // Sharing params of Person from p1 to p2
        p1.setName(p2.getName());
        p1.setAge(p2.getAge());

        p2.setName(swName);
        p2.setAge(swAge);

    }
}
