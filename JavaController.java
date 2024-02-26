package pro.Sky.coursework.curs.the.two;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping
public class JavaController {

    private final QuestionService service;

    public JavaController(QuestionService service) {
        this.service = service;
    }
    @GetMapping("/add")
    public void addQuestion(@RequestParam String question, @RequestParam String answer){
        service.add(question, answer);
    }

    @GetMapping("/remove")
    public void removeQuestion(@RequestParam String question, @RequestParam String answer){
        service.remove(question, answer);
    }

    @GetMapping("/find")
    public Collection<Question> getQuestions() {return service.getAll();}



}
