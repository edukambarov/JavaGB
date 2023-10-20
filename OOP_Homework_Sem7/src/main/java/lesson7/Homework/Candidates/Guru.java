package lesson7.Homework.Candidates;

public class Guru extends Candidate{
    private static final int GRADE = 1;

    public Guru(String name) {
        super(name, GRADE);
        minSalary = random.nextDouble(120000, 160000);
    }
}




