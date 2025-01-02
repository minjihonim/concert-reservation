package kr.hhplus.be.server.domain.concert.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_concert")
@Getter
public class Concert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "concert_id", nullable = false, columnDefinition = "bigint", updatable = false)
    private Long concertId;

    @Column(name = "name", nullable = false, length = 50, columnDefinition = "varchar(50)")
    private String name;

    @Column(name = "max_member", nullable = false, columnDefinition = "int")
    private int maxMember;

    @Column(name = "start_dt", nullable = false, columnDefinition = "datetime")
    private LocalDateTime startDt;

    @Column(name = "end_dt", nullable = false, columnDefinition = "datetime")
    private LocalDateTime endDt;

    @Column(name = "price", nullable = false, columnDefinition = "int")
    private int price;

    @Column(name = "reg_dt", nullable = false, columnDefinition = "datetime", updatable = false)
    private LocalDateTime regDt;

    @Column(name = "reg_id", nullable = false, length = 50, columnDefinition = "varchar(50)")
    private String regId;

    @Column(name = "upd_dt", columnDefinition = "datetime")
    private LocalDateTime updDt;

    @Column(name = "upd_id", length = 50, columnDefinition = "varchar(50)")
    private String updId;

}
