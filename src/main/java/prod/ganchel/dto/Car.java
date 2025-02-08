package prod.ganchel.dto;

import lombok.*;
import prod.ganchel.enums.Color;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Car {
    String model;
    BigDecimal price;
    Color color;
}
