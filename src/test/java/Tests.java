import com.example.SHHHH_Quiz_Game.Question;
import com.example.SHHHH_Quiz_Game.QuestionRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {


    @Test
    public void getQuestionsById() {
        QuestionRepository questions = new QuestionRepository();
        Question question = questions.getQuestion(1);
        String sut = question.getQuiz();
        Assertions.assertEquals("Which of these classes are the direct subclasses of the Throwable class?", sut);

    }

}
