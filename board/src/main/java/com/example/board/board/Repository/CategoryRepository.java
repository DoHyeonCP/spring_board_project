package kr.kro.hex.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.kro.hex.domain.Category;

/**
 * ī�װ� �������丮
 * 
 * @author : Rubisco
 * @version : 1.0.0
 * @date : 2022-08-21 ���� 10:20
 */

public interface CategoryRepository extends JpaRepository<Category, Long>  {}