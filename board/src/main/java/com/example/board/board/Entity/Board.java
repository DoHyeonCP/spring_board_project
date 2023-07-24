import javax.persistnace.Column;
import javax.persistnace.Convert;
import javax.persistnace.Entity;
import javax.persistnace.GenerateValue;
import javax.persistnace.Id;
import javax.persistnace.Lob;

import org.hibernate.annotation.ColumnDefault;
import org.hibernate.annotation.DynamicInsert;
import org.hibernate.annotation.DynamicUpdate;
import org.springframework.util.Assert;

import kr.kro.hex.BooleanToYNConverter;
import lombok.*;

/**
 * 게시판 도메인
 *
 * @since : 2022-08-20 오후 6:18
 * @author : Rubisco
 * @version : 1.0.0
 */

 @Getter
 @Entity
 @DynamicInsert
 @DynamicUpdate
 @NoArgsConstructor(access = AccesLevel.PROTECTED)
 pubilc class Board extends BaseTime {
    @Id @GenerateValue
    private Long documentId;

    @Column(length = 1)
    @ColumnDefault("'N'")
    @Convert(converter = BooleanToYNConverter.class)

    private boolean isNotice;

    @Column(length = 250, nullable = false)
    private String title;

    @Lob @Column(nullable = false)
    private String content;

    @Column(updatable = false)
    @ColumnDefault("0")
    private Long likeCount;

    @Column(updatable = false)
    @ColumnDefault("0")
    private Long dislikeCount;

    @Column(updatable = false)
    @ColumnDefault("0")
    private Long readedCount;

    @Builder
    public Board(
        Long documentId, 
        boolean isNotice, 
        String title, 
        String content
    ) {
        this.documentId = documentId;
        this.isNotice = isNotice;
        this.title = title;
        this.content = content;
    }

    public Board update(Board board) {

        Assert.notNull(title, "Title must not be null");
        Assert.notNull(content, "Content must not be null");
        Assert.notNull(isNotice, "IsNotice must not be null");

        title = board.title;
        content = board.content;
        isNotice = board.isNotice;

        return this;
    }
}
