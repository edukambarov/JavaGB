package lesson7.Homework.Candidates;

import lesson7.Homework.Company.Vacancy;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public abstract class Candidate implements Observer{

    protected final String name;
    protected double minSalary;
    protected static final Random random = new Random();
    private final int GRADE;
    private static final Map<Integer, String> candidatesMap = new HashMap<>(){{
        put(1, "Гуру");
        put(2, "Мастер");
        put(3, "Студент");
    }};


    public Candidate(String name, int grade) {
        this.name = name;
        GRADE = grade;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMinSalary() {
        return minSalary;
    }

    @Override
    public int getGRADE() {
        return GRADE;
    }


    @Override
    public boolean receiveOffer(Vacancy vacancy){
        if (minSalary <= vacancy.getSalary()){
            System.out.printf("%s %s (%.2f) >>> Мне нужна эта работа! [%s - %.2f]\n",
                    candidatesMap.get(GRADE), name, minSalary, vacancy, vacancy.getSalary());
            return true;
        }
        System.out.printf("%s %s >>> Я найду работу получше (%.2f)! [%s - %.2f]\n",
                candidatesMap.get(GRADE), name, minSalary, vacancy.getCompanyName(), vacancy.getSalary());
        return false;
    }
}