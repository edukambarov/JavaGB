package lesson7.Homework;

import lesson7.Homework.Agencies.JobAgency;
import lesson7.Homework.Candidates.Guru;
import lesson7.Homework.Candidates.Master;
import lesson7.Homework.Candidates.Student;
import lesson7.Homework.Company.Company;

public class Program {

    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company sever = new Company("Sever", 75000, jobAgency);
        Company zapad = new Company("Zapad", 100000, jobAgency);
        Company vostok = new Company("Vostok", 125000, jobAgency);

        Master flomaster = new Master("Flomaster");
        Guru sensei  = new Guru("Sensei");
        Student ivanov = new Student("Ivanov");

        jobAgency.registerObserver(flomaster);
        jobAgency.registerObserver(sensei);
        jobAgency.registerObserver(ivanov);

        for (int i = 0; i < 2; i++){
            vostok.needEmployee();
            zapad.needEmployee();
            sever.needEmployee();
            System.out.println();
        }
    }
}
