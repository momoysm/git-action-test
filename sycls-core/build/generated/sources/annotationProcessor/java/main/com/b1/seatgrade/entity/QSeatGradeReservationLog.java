package com.b1.seatgrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSeatGradeReservationLog is a Querydsl query type for SeatGradeReservationLog
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSeatGradeReservationLog extends EntityPathBase<SeatGradeReservationLog> {

    private static final long serialVersionUID = 1676317357L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSeatGradeReservationLog seatGradeReservationLog = new QSeatGradeReservationLog("seatGradeReservationLog");

    public final com.b1.common.QTimeStamp _super = new com.b1.common.QTimeStamp(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QSeatGrade seatGrade;

    public final EnumPath<SeatGradeReservationLogStatus> status = createEnum("status", SeatGradeReservationLogStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final com.b1.user.entity.QUser user;

    public QSeatGradeReservationLog(String variable) {
        this(SeatGradeReservationLog.class, forVariable(variable), INITS);
    }

    public QSeatGradeReservationLog(Path<? extends SeatGradeReservationLog> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSeatGradeReservationLog(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSeatGradeReservationLog(PathMetadata metadata, PathInits inits) {
        this(SeatGradeReservationLog.class, metadata, inits);
    }

    public QSeatGradeReservationLog(Class<? extends SeatGradeReservationLog> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.seatGrade = inits.isInitialized("seatGrade") ? new QSeatGrade(forProperty("seatGrade"), inits.get("seatGrade")) : null;
        this.user = inits.isInitialized("user") ? new com.b1.user.entity.QUser(forProperty("user")) : null;
    }

}

