package lesson7.Homework.Candidates;

public class Master extends Candidate {
    private static final int GRADE = 2;


    public Master(String name) {
        super(name, GRADE);
        minSalary = random.nextDouble(60000, 80000);
    }

}