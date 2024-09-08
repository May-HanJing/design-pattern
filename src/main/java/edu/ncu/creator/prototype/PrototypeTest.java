package edu.ncu.creator.prototype;

import edu.ncu.creator.prototype.present.QuestionBankController;
import org.junit.Test;

public class PrototypeTest {
    @Test
    public void test_QuestionBankController() {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("花花", "1000001921032"));
        System.out.println(questionBankController.createPaper("豆豆", "1000001921051"));
        System.out.println(questionBankController.createPaper("大宝", "1000001921987"));
    }

    @Test
    public void test_QuestionBank() throws CloneNotSupportedException {
        NewQuestionBankController questionBankController = new NewQuestionBankController();
        System.out.println(questionBankController.createPaper("花花", "1000001921032"));
        System.out.println(questionBankController.createPaper("豆豆", "1000001921051"));
        System.out.println(questionBankController.createPaper("大宝", "1000001921987"));
    }
}
