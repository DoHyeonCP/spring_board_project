import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.*;

/**
 * 회원 도메인
 *
 * @author : Rubisco
 * @version : 1.0.0
 * @since : 2022-08-21 오후 9:52
 */

@Getter
@Entity
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseTime {

    @Id @GeneratedValue
    private Long memberId;

    @Column(length = 80, nullable = false, updatable = false, unique = true)
    private String id;

    @Column(length = 60, nullable = false)
    private String password;

    @Column(unique = true)
    private String email;

    @Column(length = 40, nullable = false)
    private String name;

    @Column(length = 40, nullable = false, unique = true)
    private String nickName;

    @Column(name="last_login")
    private LocalDateTime updateDate;

    @Builder
    public Member(
            Long memberId,
            String id,
            String password,
            String email,
            String name,
            String nickName
    ) {
        this.memberId = memberId;
        this.id = id;
        this.password = password;
        this.email = email;
        this.name = name;
        this.nickName = nickName;
    }
}