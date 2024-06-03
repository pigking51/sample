package dw.smaple.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_num")
    private Long userNum;
    @Column(name = "user_name", nullable = false, length = 50)
    private String userName;
    @Column(name = "gender", nullable = false)
    private genderEnum gender;
    @Column(name = "user_id", nullable = false,length = 50)
    private String userId;
    @Column(name = "password", nullable = false,length = 255)
    private String password;
    @Column(name = "select", nullable = false)
    private AuthorityEnum select;
    @Column(name = "birthday", nullable = false)
    private LocalDate birthday;
    @Column(name = "date_joined", nullable = false)
    private LocalDateTime dateJoined;
}
