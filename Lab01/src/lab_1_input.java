import java.util.Map;

public class lab_1_input {

    public static void main(String[] args) {
	// write your code here
        defineStudentPerformance(3, 4, 5);
    }

    public static void defineStudentPerformance(Integer algebraGrade, Integer literatureGrade, Integer philosophyGrade) {
        Map<String, Integer> grades = Map.of(
                "Algebra", algebraGrade,
                "Literature", literatureGrade,
                "Philosophy", philosophyGrade
        );
        double average = 0;
        String performance;

        // Count the student's average mark
        int sum = 0;
        for (int value : grades.values()) {
            sum += value;
        }
        average = (double) sum / grades.size();

        // Define the student's performance
        if (average < 3.0) {
            performance = "Bad";
        }
        else if (average >= 3.0 && average < 4.0) {
            performance = "Average";
        }
        else if (average >= 4.0 && average < 5.0) {
            performance = "Good";
        }
        else {
            performance = "Excellent";
        }

        // Print the student's performance information
        System.out.printf("Performance is %s", performance);
    }
}