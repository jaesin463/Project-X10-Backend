package com.ragtag.X10.model.service;

import com.ragtag.X10.model.dto.UserQuestionRecord;

import java.util.List;

public interface UserQuestionRecordService {

    int createUserQuestionRecord(UserQuestionRecord userQuestionRecord);

    List<UserQuestionRecord> readUserQuestionRecord(int workbookId, String userId);

    int updateUserQuestionRecord(UserQuestionRecord userQuestionRecord);
}
