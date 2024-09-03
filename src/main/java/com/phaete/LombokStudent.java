package com.phaete;

import lombok.*;

@Data // Getter, Setter, Equals, Hash, toString
/*
@AllArgsConstructor // constructor that wants all arguments
 */
@NoArgsConstructor // default constructor
/*
@RequiredArgsConstructor // constructor that only needs the final arguments
 */
public class LombokStudent {

    private String name;
    private String id;


}
