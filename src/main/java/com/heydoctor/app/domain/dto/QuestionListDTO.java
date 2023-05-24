package com.heydoctor.app.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class QuestionListDTO {
    private Long questionId;
    private Long userId;
    private String questionTitle;
    private String questionContent;
    private String questionRegisterDatetime;
    private Boolean questionIsPublic;
    private Long questionLikeCount;
    private String doctorDepartmentType;
    private Integer readCount;

    private Integer bookmarkedCount;

    private String userName;
}
