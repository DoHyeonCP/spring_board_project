import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * �׷� ������
 * 
 * @author : Rubisco
 * @version : 1.0.0
 * @since : 2022-08-21 ���� 10:52
 */

@Getter
@Entity
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Group extends BaseTime {

    @Id @GeneratedValue
    private Long groupId;

    @Column(length = 80, nullable = false, unique = true)
    private String group;

    @Builder
    public Group(Long groupId, String group) {
        this.groupId = groupId;
        this.group = group;
    }
}