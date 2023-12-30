package com.ragtag.X10.controller;

import com.ragtag.X10.model.dto.Notice;
import com.ragtag.X10.model.dto.TodoList;
import com.ragtag.X10.model.service.GroupsService;
import com.ragtag.X10.model.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"}, maxAge = 6000)
@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @Autowired
    private GroupsService groupsService;

    @PostMapping("/create")
    public ResponseEntity<?> createNotice(@RequestBody Notice notice) {
        int result = noticeService.createOne(notice);

        if (result == 0)
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/read/{userId}")
    public ResponseEntity<?> readAll(@PathVariable("userId") String userId) {
        List<Notice> noticeList = noticeService.usersAllNotice(userId);
        if (noticeList == null || noticeList.isEmpty())
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(noticeList, HttpStatus.OK);
    }

    @PutMapping("/check")
    public ResponseEntity<?> checkNotice(@RequestBody Notice notice) {
        int result = 0;
        // 그룹 초대 알림
        if (notice.getNoticeType() == 1)
            result = groupsService.registGroup(notice.getSendGroup(), notice.getReceiverId());

        noticeService.checkNotice(notice.getNoticeId());
        if (result == 0)
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{noticeId}")
    public ResponseEntity<?> deleteTodo(@PathVariable("noticeId") int noticeId) {
        int result = noticeService.deleteNotice(noticeId);
        if (result == 0)
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
