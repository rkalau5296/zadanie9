package zad9.zad9.model;

import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Autowired
    public User(Long id, String first_name, String last_name, String email, String gender, String ipAddress) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.ipAddress = ipAddress;
    }
}
