package com.adozgen.sbdesignpatterns.prototype;

import com.adozgen.sbdesignpatterns.prototype.example1.Author;
import com.adozgen.sbdesignpatterns.prototype.example2.ExamSession;
import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PrototypeTestCreator {

    @Autowired
    private ApplicationContext context;

    @PostConstruct
    public void init() {
        //example1 test
        List<String> books = List.of("book1", "book2");
        Author author = new Author("ahmet", books);
        Author clonedAuthor = author.clone();

        System.out.println("Original Author: " + author.getName());
        System.out.println("Cloned Author: " + clonedAuthor.getName());

        // Kitap listelerini kontrol ediyoruz
        System.out.println("Original Author's Books: " + author.getBooks().size());
        System.out.println("Cloned Author's Books: " + clonedAuthor.getBooks().size());

        //example2 test
        ExamSession examSession = context.getBean(ExamSession.class);
        System.out.println("Exam Session: " + examSession.getSessionId());
    }

}
