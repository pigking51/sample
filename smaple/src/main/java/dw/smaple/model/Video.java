package dw.smaple.model;

import jakarta.persistence.*;

@Entity
@Table(name = "video")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "video_id")
    private Long videoId;
    @Column(name = "title", nullable = false, length = 100)
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "genre", nullable = false, length = 50)
    private String genre;
    @Column(name = "video_url")
    private String videoUrl;
    @Column(name = "rating", nullable = false, length = 5)
    private int rating;

}
