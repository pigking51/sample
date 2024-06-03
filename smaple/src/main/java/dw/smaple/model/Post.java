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
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long postId;
    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board boardId;
    @ManyToOne
    @JoinColumn(name = "user_num")
    private User userNum;
    @Column(name = "title", nullable = false, length = 255)
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "post_date", nullable = false)
    private LocalDateTime postDate;
}
