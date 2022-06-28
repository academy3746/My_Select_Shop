package com.sparta.week04.models;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
// Get Method 자동생성
@MappedSuperclass
// 해당 멤버변수 (createdAt, modifiedAt)가 DB 서버에서 컬럼으로 생성되도록 설정
@EntityListeners(AuditingEntityListener.class)
// 테이블 값이 변경되었을 때, 자동으로 기록되도록 설정

public abstract class TimeStamped {
    // This class is abstract class for inheritance.
    @CreatedDate
    // 최초 생성 시간
    private LocalDateTime createdAt;

    @LastModifiedDate
    // 마지막 변경 시간
    private LocalDateTime modifiedAt;
}
