package com.test.web.service;

import java.sql.SQLException;
import java.util.List;

public interface NoticeService {

	List<Notice> getList(int i, String string, String string2) throws ClassNotFoundException, SQLException;
	int getCount() throws ClassNotFoundException, SQLException;
	int insert(Notice notice) throws SQLException, ClassNotFoundException ;	
	int update(Notice notice) throws SQLException, ClassNotFoundException ;	
	int delete(int id) throws ClassNotFoundException, SQLException ;

}
