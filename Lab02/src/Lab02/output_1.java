package Lab02;

public class output_1 {

    public static void main(String[] args) {
        Person person = new Person("John", 19, "Male", 180, 80);
        Score score = new Score(1, 2, 3, 4, 5);
        calculateScore(person, score);
    }

    public static void calculateScore(Person person, Score score) {
        System.out.printf("Name: %s%n", person.name);
        System.out.printf("Age: %d%n", person.age);
        System.out.printf("Gender: %s%n", person.gender);
        System.out.printf("Height: %d%n", person.height);
        System.out.printf("Weight: %d%n", person.weight);
        System.out.printf("Total Score: %d%n", score.calculateTotal());
        System.out.printf("Adult: %b%n", person.isAdult);
    }
}

class Person {
    String name;
    Integer age;
    String gender;
    Integer height;
    Integer weight;
    Boolean isAdult;

    Person(String name, Integer age, String gender, Integer height, Integer weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.isAdult = isAdult();
    }

    Boolean isAdult() {
        return age >= 18;
    }
}

class Score {
    private Integer[] scores;

    Score(Integer... scores) {
        this.scores = scores;
    }

    Integer calculateTotal() {
        int total = 0;
        for (Integer score : scores) {
            total += score;
        }
        return total;
    }
}