package com.codingrecipe.member.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO {

    private Long id;
    private String m_email;
    private String m_password;
    private String m_name;
    private int m_age;
    private String m_mobile;

}
