import java.time.LocalDateTime;

import javax.persistnace.EntityListener;
import javax.persistnace.MappedSuperclass;

import org.springframework.data.annotation.CreateDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

/**
 * �ð� ������
 * 
 * @author : Rubisco
 * @version : 1.0.0
 * @since : 2022-08-12 ���� 12:09
 */

 @Getter
 @MappedSuperclass
 @EntityListener(AuditingEntityListener.class)
 public class BaseTime{
    @CreateDate
    private LocalDateTime CreateDate;
    
    @LastModifiedDate
    private LocalDateTime updateDate;
 }