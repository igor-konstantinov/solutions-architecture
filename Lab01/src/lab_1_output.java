import java.util.LinkedHashMap;
import java.util.Map;

public class lab_1_output {

    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades(3, 4, 5);
        int averageGrade = studentGrades.countAverageGrade();
        System.out.printf("Performance is %s%n", studentGrades.defineStudentPerformance(averageGrade));
    }
}

class StudentGrades {
    private int algebraGrade;
    private int literatureGrade;
    private int philosophyGrade;

    StudentGrades(int algebraGrade, int literatureGrade, int philosophyGrade) {
        this.algebraGrade = algebraGrade;
        this.literatureGrade = literatureGrade;
        this.philosophyGrade = philosophyGrade;
    }

    private Map<String, Integer> buildGradesMap() {
        Map<String, Integer> grades = new LinkedHashMap<>();
        grades.put("Algebra", algebraGrade);
        grades.put("Literature", literatureGrade);
        grades.put("Philosophy", philosophyGrade);
        return grades;
    }

    String defineStudentPerformance(int averageGrade) {
        if (averageGrade < 3) {
            return "Bad";
        } else if (averageGrade < 4) {
            return "Average";
        } else if (averageGrade < 5) {
            return "Good";
        } else {
            return "Excellent";
        }
    }

    int countAverageGrade() {
        Map<String, Integer> gradesMap = buildGradesMap();
        int sum = gradesMap.values().stream().mapToInt(Integer::intValue).sum();
        return sum / gradesMap.size();
    }
}