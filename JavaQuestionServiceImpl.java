package pro.Sky.coursework.curs.the.two;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionServiceImpl implements QuestionService{

    private final Set<Question> questionsRepository = new HashSet<>();
    private Random random = new Random();
    public void setRandom(Random random) {this.random = random;}
    @Override
    public boolean add(String question, String answer) {
        return questionsRepository.add(new Question(question, answer));
    }
    @Override
    public boolean remove(String question, String answer) {

    return questionsRepository.remove(new Question(question, answer));
}

    @Override
    public Collection<Question> getAll() {
        return Set.copyOf(questionsRepository);
    }

    @Override
    public Question getRandomQuestion() {
        return List.copyOf(questionsRepository).get(random.nextInt(questionsRepository.size()));
    }

    @Override
    public int getSize() {
        return questionsRepository.size();
    }
}
