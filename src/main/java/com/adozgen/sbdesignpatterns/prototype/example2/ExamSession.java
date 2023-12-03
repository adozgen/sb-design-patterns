package com.adozgen.sbdesignpatterns.prototype.example2;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Component
@Scope("prototype")
@Data
public class ExamSession {
    private String sessionId;
    private List<String> questions;
    private Map<Integer, String> answers;

    public ExamSession() {
        this.sessionId = UUID.randomUUID().toString();
        this.questions = List.of("Question 1", "Question 2", "Question 3");
        this.answers = new HashMap<>();
    }
}
