package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {



    @ApiOperation(value = " Welcome" ,notes = "the welcome")
    @GetMapping(value = "")
    public String welcomeMathmsg(){
        return "welcome to Math";
    }

    @ApiOperation(value = " division" ,notes = "the divisor metod")
    @GetMapping(value = "/division-info")
    public ArithmeticOperation divisionInfo(){

        ArithmeticOperation arithmeticOperation = new ArithmeticOperation("division",1,
                "division is the inverse of multiplication", new String[]{"distribution","invariant"});

        return arithmeticOperation;

    }

    @ApiOperation(value = " multiplication" ,notes = "the multiplication metod")
    @GetMapping(value = "/multiplication")
    public int multiplication(@RequestParam int n1, @RequestParam int n2){
        return n1 * n2;
    }


    @ApiOperation(value = " square" ,notes = "the square metod")
    @GetMapping(value = "/square/{n}")
    public int square(@PathVariable int n){
        int square = n * n;
        return square;
    }

}