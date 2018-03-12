public class HelloWorld {
    public static void main(String[] args) {
        AnotherClass anotherClass = new AnotherClass();
        MyMathClass myMathClass = new MyMathClass();

        int numb1 = 2;
        int numb2 = 4;
        String name = "Chow Hing";

        System.out.println("hello Chow Hing");
        anotherClass.printSomething();
        System.out.println(myMathClass.addTwoNumbers());
        System.out.println(myMathClass.addTwoNumbers(numb1, numb2));

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Hello " + name);

        }
    }
}
