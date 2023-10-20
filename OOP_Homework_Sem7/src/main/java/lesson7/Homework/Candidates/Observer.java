package lesson7.Homework.Candidates;


import lesson7.Homework.Company.Vacancy;

public interface Observer {

    boolean receiveOffer(Vacancy vacancy);

    public String getName();

    public double getMinSalary();

    public int getGRADE();

}
