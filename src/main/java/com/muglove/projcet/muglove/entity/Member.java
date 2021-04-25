package com.muglove.projcet.muglove.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="member")
@Getter
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SEQ_NO;

    private String USER_ID;
    private String EMAIL;
    private String NAME;
    private String PSSWD;

    @Builder
    public Member(String USER_ID,String EMAIL,String NAME, String PSSWD)
    {
        this.USER_ID=USER_ID;
        this.EMAIL=EMAIL;
        this.NAME=NAME;
        this.PSSWD=PSSWD;
    }


}