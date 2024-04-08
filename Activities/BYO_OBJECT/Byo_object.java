package Activities.BYO_OBJECT;

public class Byo_object {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Oreo", 4, false);
        Dog dog2 = new Dog("Summit", 5, true);
        
        dog1.Bark();

        System.out.println("Dog 1 Age: " + dog1.getAge());

        Dog dog3 = new Dog(dog1);
        dog3.setName("Jeff");

        dog1.AgeUp();
        System.out.println("Dog 1 New Age: " + dog1.getAge());

        dog2.Bark();
        System.out.println("Dog 2 Age: " + dog2.getAge());
        dog2.AgeDown();
        System.out.println("Dog 2 New Age: " + dog2.getAge());

        System.out.println("Dog 1 is the same age as dog 2: " + dog1.equals(dog2));

        dog3.Bark();

        System.out.println(dog3);
    }
}
