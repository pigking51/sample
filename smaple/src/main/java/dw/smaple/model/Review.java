package dw.smaple.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="review_id")
    private long id;
    @ManyToOne
    @JoinColumn(name="post")
    private Post post;
    @ManyToOne
    @JoinColumn(name="user")
    private User user;
    @Column(name= "point", nullable = false)
    private int point;
    @Column(name= "review_text", length=65535)
    private String reviewText;
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
}
