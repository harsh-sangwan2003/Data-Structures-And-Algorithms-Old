public class swap_game_3 {
    
    public static class Person{

        int age;
        String name;

        void sayshi(){

            System.out.println(name+"["+age+"]"+"sayshi");
        }
    }

    public static void main(String[] args) {
        
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "A";
        // p1.sayshi();

        Person p2 = new Person();
        p2.age = 20;
        p2.name = "B";
        // p2.sayshi();

        p1.sayshi();
        p2.sayshi();
        swap1(p1,p2);
        p1.sayshi();
        p2.sayshi();
    }

    public static void swap1(Person psn1, Person psn2)
    {
        psn1 = new Person();

        int age = psn1.age;
        psn1.age = psn2.age;
        psn2.age = age;

        psn2 = new Person();
        
        String name = psn1.name;
        psn1.name = psn2.name;
        psn2.name = name;
    }
}
