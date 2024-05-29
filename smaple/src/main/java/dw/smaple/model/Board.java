package dw.smaple.model;

import jakarta.persistence.*;

@Entity
@Table(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardID;
    @Column(name = "board_name", length = 100)
    private String boardName;
    @Column(name = "description")
    private String description;
}
