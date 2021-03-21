package zad9.zad9.model;

import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document
@ToString
public class User {

    @Id
    private Long id;

    @CsvBindByName
    private String first_name;

    @CsvBindByName
    private String last_name;

    @CsvBindByName
    private String email;

    @CsvBindByName
    private String gender;

    @CsvBindByName(column = "ip_address")
    private String ipAddress;

    public User(Long id, String first_name, String last_name, String email, String gender, String ipAddress) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.ipAddress = ipAddress;
    }
}
