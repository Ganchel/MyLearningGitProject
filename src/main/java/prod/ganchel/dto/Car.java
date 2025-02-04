package prod.ganchel.dto;

import lombok.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Car {
    String model;
    BigDecimal price;
}
