public class HelloMain {

    public static void main(String[] args) {
        System.out.println("Hello, Inheritance!");
        Say something = new SayHello();
        System.out.println("Hola, World");
        something.saySomething();

        int[] array = {1,2,3,4,5};
        int arraySum = 0;
        for (int i : array) {
            arraySum += i;
        }

        System.out.println(arraySum);
    }
}
