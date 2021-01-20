public class SimpleCalculator {

    private int firstNumber;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = (int) firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = (int) secondNumber;
    }

    public int getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public int getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    public int getMultiplicationResult(){
        return firstNumber * secondNumber;
    }

    public int getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }
        else {
            return firstNumber / secondNumber;
        }
    }

}
