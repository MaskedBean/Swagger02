package com.example.Swagger02.Entities;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArithmeticOperation {

    @ApiModelProperty(value = "Operation name", example = "Sum")
    String name;

    @ApiModelProperty(value = "Minimum number of operands necessary do computer the operation", example = "2")
    Integer minimumNumberOfOperand;

    @ApiModelProperty(value = "Descprioption of the operations", example = "Square is the multiplication of a number for itself")
    String description;

    @ApiModelProperty(value = "Properties of the operation", example = "Commutativa, associativa")
    String[] properties;
}
