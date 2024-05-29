package dw.smaple.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userNum;
    @Column(name = "user_name", nullable = false, length = 50)
    private String userName;
    @Column(name = "gender", nullable = false)
    private genderEnum gender;
    @Column(name = "user_id", nullable = false,length = 50)
    private String userID;
    @Column(name = "password", nullable = false,length = 255)
    private String password;
    @Column(name = "select", nullable = false)
    private authorityEnum select;
    @Column(name = "birthday", nullable = false)
    private LocalDate birthday;
    @Column(name = "date_joined", nullable = false)
    private LocalDateTime dateJoined;
}
