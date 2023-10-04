package ie.atu.calculator_2;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CalculatorController {
    @GetMapping("/calculate")
    public Calculator newCalculation(@RequestParam int num1, @RequestParam int num2, @RequestParam String operator){
        Calculator total = new Calculator(operator, 0);
        total.setOperator(operator);
        total.getAnswer();
        return total.calculation(num1, num2);
        //return new Calculator(operator, total.calculation(num1, num2));
    }
}
