package com.learnkafka.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
//@EqualsAndHashCode
public class Book {
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
}
