package com.project.__cs.repository;

import com.project.__cs.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// <entity 클래스 이름, pk 타입>
public interface MemberRepository extends JpaRepository <MemberEntity, Long> {
}
