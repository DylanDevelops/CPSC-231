public class Dog {
    // All Member Variables
    private String name;
    private int age;
    private boolean isGirl;

    // Default Constructor
    public Dog() {
        this.name = "";
        this.age = 0;
        this.isGirl = false;
    }

    // Overloaded Constructor
    public Dog(String name, int age, boolean isGirl) {
        this.name = name;
        this.age = age;
        this.isGirl = isGirl;
    }

    // Copy Constructor
    public Dog(Dog dog) {
        this.name = dog.name;
        this.age = dog.age;
        this.isGirl = dog.isGirl;
    }

    // To String Method
    public String toString() {
        return "Name: " + name + " | Age: " + age + " | Is Girl: " + isGirl;
    }

    // Equals Method
    public boolean equals(Dog dog) {
        if(this.age == dog.age) {
            return true;
        }
        return false;
    }

    // Mutator for 'name'
    public void setName(String text) {
        name = text;
    }

    // Mutator for 'age'
    public void setAge(int value) {
        age = value;
    }

    // Mutator for 'isGirl'
    public void setIsGirl(boolean value) {
        isGirl = value;
    }

    // Accessor for 'name'
    public String getName() {
        return name;
    }

    // Accessor for 'age'
    public int getAge() {
        return age;
    }

    // Accessor for 'isGirl'
    public boolean getIsGirl() {
        return isGirl;
    }

    // Class Function #1
    public void Bark() {
        System.out.println(name + " decided to bark!");
    }

    // Class Function #2
    public void AgeUp() {
        age++;
    }

    // Class Function #3
    public void AgeDown() {
        age--;
    }
}
