package prod.ganchel.dto;

import lombok.*;
import prod.ganchel.enums.Color;
import prod.ganchel.enums.EngineType;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Car {
    String model;
    BigDecimal price;
    Color color;
    EngineType engineType;
    Engine engine;
}
