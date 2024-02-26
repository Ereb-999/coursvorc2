package pro.Sky.coursework.curs.the.two;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidQestionRequestException extends IllegalArgumentException {
    public InvalidQestionRequestException(int amount, int size){
        super(String.format("Request amount: more then current size ", amount, size));
    }
}
