package ie.atu.calculator_2;

import org.springframework.stereotype.Service;


public class Calculator {
    public String getOperator() {
        return operator;
    }

    public void setAnswer(float answer) {
        this.answer = answer;
    }

    private String operator;
    private float answer;
    public Calculator(String operator, float answer) {
        this.operator = operator;
        this.answer = answer;
    }


    public void setOperator(String operator) {this.operator = operator;}

    public float getAnswer() {return answer;}

    public Calculator calculation(int num1, int num2){
        switch(operator){
            case "add": this.answer = num1 + num2; break;
            case "subtract": this.answer = num1 - num2; break;
            case "multiply": this.answer = num1 * num2; break;
            case "divide": this.answer = (float) num1 / num2; break;
            default: this.operator = "Invalid operator"; this.answer = 0; break;
        }
     return new Calculator(this.operator, this.answer);

    }
}
