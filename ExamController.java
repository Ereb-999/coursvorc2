package pro.Sky.coursework.curs.the.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

public class ExamController {

    private final ExaminerService service;

    public ExamController(ExaminerService service){this.service = service;}

    @GetMapping("/get/{amount}")
    public Collection<Question> getQuestion(@PathVariable int amount){return service.getQuestions(amount);}
}
