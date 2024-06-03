package dw.smaple.model;

import jakarta.persistence.*;

@Entity
@Table(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long boardId;
    @Column(name = "board_name", length = 100)
    private String boardName;
    @Column(name = "description")
    private String description;
}
