package com.codingrecipe.member.repository;

import com.codingrecipe.member.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor // 의존성 주입 받기
public class MemberRepository {
    // SqlSessionTemplate
    private final SqlSessionTemplate sql; // mybatis

    public int save(MemberDTO memberDTO) throws Exception {
        System.out.println("memberDTO = " + memberDTO);
        return sql.insert("MemberMapper.save", memberDTO);
    }
}
