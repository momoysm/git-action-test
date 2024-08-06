package com.b1.content.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QContentDetailImage is a Querydsl query type for ContentDetailImage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QContentDetailImage extends EntityPathBase<ContentDetailImage> {

    private static final long serialVersionUID = 2133297749L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QContentDetailImage contentDetailImage = new QContentDetailImage("contentDetailImage");

    public final QContent content;

    public final StringPath detailImagePath = createString("detailImagePath");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<ContentDetailImageStatus> status = createEnum("status", ContentDetailImageStatus.class);

    public QContentDetailImage(String variable) {
        this(ContentDetailImage.class, forVariable(variable), INITS);
    }

    public QContentDetailImage(Path<? extends ContentDetailImage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QContentDetailImage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QContentDetailImage(PathMetadata metadata, PathInits inits) {
        this(ContentDetailImage.class, metadata, inits);
    }

    public QContentDetailImage(Class<? extends ContentDetailImage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.content = inits.isInitialized("content") ? new QContent(forProperty("content"), inits.get("content")) : null;
    }

}

