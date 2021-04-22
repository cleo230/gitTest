package com.test.web.controller.admin;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.web.service.Notice;
import com.test.web.service.NoticeService;

@RestController("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	public List<Notice> list() throws ClassNotFoundException, SQLException {
		System.out.println(" admin list start ----------");
		List<Notice> list = noticeService.getList(1, "title", "");
		System.out.println(" admin list end ----------");
		return list;
	}
	
	@RequestMapping("reg")
	@ResponseBody
	public String reg(String title, String content, String[] foods) {
		System.out.println ("title:"+ title+ ", content:"+ content +",foods:"+ foods);
		for(String food: foods){
			System.out.println(food+",");
		}
		return String.format("title:%s<br> content:%s<br> foods:%s<br>", title,content, foods);
	}
}
