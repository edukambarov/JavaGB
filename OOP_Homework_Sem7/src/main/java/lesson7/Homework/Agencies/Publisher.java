package lesson7.Homework.Agencies;



import lesson7.Homework.Candidates.Observer;
import lesson7.Homework.Company.Vacancy;

import java.util.List;

public interface Publisher {

    /**
     * Регистрация нового наблюдателя
     */
    default void registerObserver() {
        registerObserver(null);
    }

    /**
     * Регистрация нового наблюдателя
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * Убрать наблюдателя из списка
     * @param observer
     */
    void removeObserver(Observer observer);


    /**
     * Компания отправляет новую вакансию
     */
    List<Observer> sendOffer(Vacancy vacancy);


}