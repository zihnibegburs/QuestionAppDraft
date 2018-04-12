package com.begburs.mevlutBul.repository;

import com.begburs.mevlutBul.model.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long> {

    Question save(Question question);

}
