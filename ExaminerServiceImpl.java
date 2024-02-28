package pro.Sky.coursework.curs.the.two;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private static final Logger log = LoggerFactory.getLogger(ExaminerServiceImpl.class);
    private final QuestionService questionServices;

    public ExaminerServiceImpl(QuestionService questionServices) {
        this.questionServices = questionServices;
    }

    private Random random = new Random();
    public void setRandom(Random random) {this.random = random;}

    @Override
    public Collection<Question> getQuestions(int amount) {
        int size = questionServices.getSize();
        if(amount <= 0 || size < amount){
            log.error("Wrong requested amount, should b less then " + size);
            throw new InvalidQestionRequestException(amount, size);
        }
        Set<Question> questions = new HashSet<>();
        while (questions.size() < amount){
            questions.add(questionServices.getRandomQuestion());
        }
        log.info("Questions were retrieved " + questions);
        return questions;
    }
}
