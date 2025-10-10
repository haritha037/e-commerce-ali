package com.haritha.ecommerce.customer;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class Customer {
    @Id
    private String id; // // The primary key is a String in MongoDB
    private String firstName;
    private String lastName;
    private String email;
    private Address address;

}
