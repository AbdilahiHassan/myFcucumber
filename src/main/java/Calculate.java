public class Calculate {
    private int first;
    private int second;
    private int result;

    public void addFirstNumber(int firstNumber) {
        first = firstNumber;
    }

    public void addSecondNumber(int secondNumber) {
        second = secondNumber;
    }

    public void add() {
        result = first + second;
    }
    public void Subtra() {
        result = first - second;
    }



    public int getResult() {
        return result;
    }


    public void Mult() {
        result = first* second;
    }

    public void Divide() {
        result= first/second;
    }
}




