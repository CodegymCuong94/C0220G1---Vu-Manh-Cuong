package service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double sub(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multi(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public String divi(double num1, double num2) {
        if (num2 != 0) {
            return "" + num1 / num2;
        } else {
            return "đéo chia đc";
        }
    }
}
