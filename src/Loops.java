public class Loops {
    public static void main(String[] args) {
        int count = 1;

        // Loop will continue as long as count is less than or equal to 5
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++; // Incrementing count by 1 in each iteration
        }

        System.out.println("Loop finished.");

        int countt = 1;

        // Executes the loop at least once and then checks the condition
        do {

            System.out.println("Count is: " + countt);
            countt++; // Incrementing count by 1 in each iteration
        } while (countt <= 7);

        System.out.println("Loop finished.");

        // Looping from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Value of i: " + i);
        }

        System.out.println("Loop finished.");
    }
}
