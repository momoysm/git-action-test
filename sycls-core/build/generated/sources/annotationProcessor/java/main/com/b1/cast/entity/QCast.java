package com.b1.cast.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCast is a Querydsl query type for Cast
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCast extends EntityPathBase<Cast> {

    private static final long serialVersionUID = 1478449773L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCast cast = new QCast("cast");

    public final com.b1.common.QTimeStamp _super = new com.b1.common.QTimeStamp(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imagePath = createString("imagePath");

    public final StringPath name = createString("name");

    public final com.b1.round.entity.QRound round;

    public final EnumPath<CastStatus> status = createEnum("status", CastStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCast(String variable) {
        this(Cast.class, forVariable(variable), INITS);
    }

    public QCast(Path<? extends Cast> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCast(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCast(PathMetadata metadata, PathInits inits) {
        this(Cast.class, metadata, inits);
    }

    public QCast(Class<? extends Cast> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.round = inits.isInitialized("round") ? new com.b1.round.entity.QRound(forProperty("round"), inits.get("round")) : null;
    }

}

