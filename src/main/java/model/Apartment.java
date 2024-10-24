package model;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@Setter
@Builder
public class Apartment {
   @Id
    private Long id;
    private Long price;
    private Double square;
    private Integer floor;
    private Boolean withChildren;
    private Boolean withAnimal;
}
