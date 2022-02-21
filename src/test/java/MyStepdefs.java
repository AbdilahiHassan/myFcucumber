import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class MyStepdefs {

    private Calculate calc;

    @Given("I have first number {int}")
    public void iHaveFirstNumber(int firstNumber) {
        calc = new Calculate();
        calc.addFirstNumber(firstNumber);
    }

    @Given("I have second number {int}")
    public void iHaveSecondNumber(int secondNumber) {
        calc.addSecondNumber(secondNumber);
    }

    @When("I add the two numbers")
    public void iAddTheTwoNumbers() {
        calc.add();

    }



    @Then("I get the result {int}")
    public void iGetTheResult(int expected) {
        int actual = calc.getResult();

        assertEquals(expected, actual);
    }

    @When("I sub the two numbers")
    public void iSubTheTwoNumbers() {
        calc.Subtra();
    }

    @When("I Mult  the two numbers")
    public void iMultTheTwoNumbers() {
        calc.Mult();
    }

    @When("I Divide  the two numbers")
    public void iDivideTheTwoNumbers() {
        calc.Divide();
    }
}
