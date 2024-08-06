package com.b1.seatgrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSeatGrade is a Querydsl query type for SeatGrade
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSeatGrade extends EntityPathBase<SeatGrade> {

    private static final long serialVersionUID = 1483977589L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSeatGrade seatGrade = new QSeatGrade("seatGrade");

    public final EnumPath<SeatGradeType> grade = createEnum("grade", SeatGradeType.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final com.b1.round.entity.QRound round;

    public final com.b1.seat.entity.QSeat seat;

    public final EnumPath<SeatGradeStatus> status = createEnum("status", SeatGradeStatus.class);

    public final NumberPath<Long> ticketId = createNumber("ticketId", Long.class);

    public QSeatGrade(String variable) {
        this(SeatGrade.class, forVariable(variable), INITS);
    }

    public QSeatGrade(Path<? extends SeatGrade> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSeatGrade(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSeatGrade(PathMetadata metadata, PathInits inits) {
        this(SeatGrade.class, metadata, inits);
    }

    public QSeatGrade(Class<? extends SeatGrade> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.round = inits.isInitialized("round") ? new com.b1.round.entity.QRound(forProperty("round"), inits.get("round")) : null;
        this.seat = inits.isInitialized("seat") ? new com.b1.seat.entity.QSeat(forProperty("seat"), inits.get("seat")) : null;
    }

}

