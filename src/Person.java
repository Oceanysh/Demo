class Person {

    void eat() {
        System.out.println("person can eat");
    }

    String hasName() {
        return ("person can walk from return");
    }

    public static void main(String[] args) {
        new Person().eat();
        System.out.println(new Person().hasName());

    }

}
