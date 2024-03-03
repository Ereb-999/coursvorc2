package pro.Sky.coursework.curs.the.two;

import java.util.Collection;

public interface QuestionService {
    void add(String question, String answer);
    void remove(String question, String answer);
    Collection<Question> getAll();
    Question getRandomQuestion();
    int getSize();

}
