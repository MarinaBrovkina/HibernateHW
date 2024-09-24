package org.example.embeddable;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Data
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class Contact implements Serializable {

    private String firstName;
    private String lastName;
    private int age;

}

