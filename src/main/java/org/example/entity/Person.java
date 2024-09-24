package org.example.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.example.embeddable.Contact;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {

    private String phoneNumber;
    private String cityOfLiving;
    @EmbeddedId
    private Contact contact;
}


