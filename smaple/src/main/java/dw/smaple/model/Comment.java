package dw.smaple.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long commentId;
    @ManyToOne
    @JoinColumn(name = "post")
    private Post post;
    @ManyToOne
    @JoinColumn(name = "user")
    private User user;
    @Column(name = "comment_text")
    private String commentText;
    @Column(name = "comment_date", nullable = false)
    private LocalDateTime commentDate;
}
