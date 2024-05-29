package dw.smaple.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentID;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post postID;
    @ManyToOne
    @JoinColumn(name = "userNum")
    private User userNum;
    @Column(name = "comment_text")
    private String commentText;
    @Column(name = "comment_date", nullable = false)
    private LocalDateTime commentDate;
}
