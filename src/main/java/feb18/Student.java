package feb18;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Student {

    private String fName;
    private String lName;
    private String course;
    private int marks;
}
