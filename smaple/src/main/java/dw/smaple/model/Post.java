package dw.smaple.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postID;
    @ManyToOne
    @JoinColumn(name = "boardID")
    private Board boardID;
    @ManyToOne
    @JoinColumn(name = "userNum")
    private User userNum;
    @Column(name = "title", nullable = false, length = 255)
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "post_date", nullable = false)
    private LocalDateTime postDate;
}
