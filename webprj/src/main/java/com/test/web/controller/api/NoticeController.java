package com.test.web.controller.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.web.service.Notice;
import com.test.web.service.NoticeService;

@RestController("apiNoticeController")
@RequestMapping("/api/notice/")
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	public List<Notice> list() throws ClassNotFoundException, SQLException {
		System.out.println(" api list start ----------");
		List<Notice> list = noticeService.getList(1, "title", "");
		System.out.println(" api list end ----------");
		return list;
	}
}
