package com.b1.round.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRound is a Querydsl query type for Round
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRound extends EntityPathBase<Round> {

    private static final long serialVersionUID = 2066277269L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRound round = new QRound("round");

    public final com.b1.content.entity.QContent content;

    public final TimePath<java.time.LocalTime> endTime = createTime("endTime", java.time.LocalTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.b1.place.entity.QPlace place;

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public final DatePath<java.time.LocalDate> startDate = createDate("startDate", java.time.LocalDate.class);

    public final TimePath<java.time.LocalTime> startTime = createTime("startTime", java.time.LocalTime.class);

    public final EnumPath<RoundStatus> status = createEnum("status", RoundStatus.class);

    public QRound(String variable) {
        this(Round.class, forVariable(variable), INITS);
    }

    public QRound(Path<? extends Round> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRound(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRound(PathMetadata metadata, PathInits inits) {
        this(Round.class, metadata, inits);
    }

    public QRound(Class<? extends Round> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.content = inits.isInitialized("content") ? new com.b1.content.entity.QContent(forProperty("content"), inits.get("content")) : null;
        this.place = inits.isInitialized("place") ? new com.b1.place.entity.QPlace(forProperty("place")) : null;
    }

}

