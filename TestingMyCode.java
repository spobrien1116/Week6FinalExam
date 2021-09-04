public class TestingMyCode {

    public static void main(String[] args) {
        //For loop that prints every even number from 0 to 100.
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //Input for method returnsProduct.
        System.out.println(returnsProduct(4,3));
        //Input for method multiplyName.
        System.out.println(multiplyName("Tom", 3));
        //Input for method createStringCount.
        System.out.println(createStringCount(5));
    }
    //Method named multiply that takes two int parameters and returns the product.
    public static int returnsProduct(int a, int b) {
        int sum = a * b;
        return sum;
    }
    //Method that takes two parameters, a String name and an int times. Prints one line
    //with the name duplicated by the times parameter.
    public static String multiplyName(String name, int x) {
        String finishedWord = name;
        for (int i = 0; i < x - 1; i++) {
            finishedWord+= name;
        }
        return finishedWord;
    }
    //Method that takes an int and returns a String that counts from zero to the value of
    //the int passed in. Example: createStringCount(5); would yield "012345".
    public static String createStringCount(int number) {
        StringBuilder fullCount = new StringBuilder();
        for (int i = 0; i < number + 1; i++) {
            fullCount.append(i);
        }
        return fullCount.toString();
    }
}