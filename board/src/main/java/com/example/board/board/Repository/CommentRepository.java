package kr.kro.hex.persistence;

import org.springframework.data.repository.JpaRepository;

import kr.kro.hex.domain.Comments;

/**
 * ��� �������丮
 * 
 * @author : Rubisco
 * @version : 1.0.0
 * @date : 2022-08-21 ���� 10:20
 */

public interface CommentRepository extends JpaRepository<Comments, Long>  {}