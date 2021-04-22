package com.test.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.web.service.Notice;
import com.test.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")

public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	public String list(String p) throws ClassNotFoundException, SQLException {
		System.out.println("page:"+ p);
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		return "notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "notice.detail";
	}
	
	
}
