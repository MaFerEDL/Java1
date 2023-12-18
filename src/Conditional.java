public class Conditional {
    public static void main(String[] args) {
        int number = 20;

        // Check if the number is greater than 10
        if (number > 10) {
            System.out.println("The number is greater than 10.");
        } else {
            System.out.println("The number is less than or equal to 10.");
        }

        int day = 4;
        String dayString;

        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
                break;
        }

        System.out.println("The day is: " + dayString);
    }
}


