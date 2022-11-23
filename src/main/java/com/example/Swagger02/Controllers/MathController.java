package com.example.Swagger02.Controllers;

import com.example.Swagger02.Entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/math")
public class MathController {

    @ApiOperation(value = "Welcome message", notes = "Provide a welcome message for the User")
    @GetMapping("")
    public String welcomeMathMsg(){return "Welcome to the math controller";}

    @ApiOperation(value = "Division Operation", notes = "Returns a new ArithmeticOperation with all the details about the division")
    @GetMapping("/division-info")
    public ArithmeticOperation division(){
        return new ArithmeticOperation("Division", 2, "Operazione matematica inversa della moltiplicazione", new String[]{"Associativa", "Distributiva"});
    }

    @ApiOperation(value = "Multiplication", notes = "Takes two int parameters and returns the multiplication value")
    @GetMapping("/multiplication")
    public int multiplication(int firstParameter, int secondParameter){
        return firstParameter * secondParameter;
    }
    @ApiOperation(value = "Square of a number", notes = "Multiplication of a number for itself")
    @GetMapping("/square/{n}")
    public int square(int number){
        return number * number;
    }

}
