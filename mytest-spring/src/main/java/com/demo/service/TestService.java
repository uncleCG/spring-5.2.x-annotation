package com.demo.service;

import com.demo.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangchangyong
 * @date 2020-07-31 15:38
 */
@Service
public class TestService {

	@Autowired
	private TestDao testDao;

	public String printStr(String string) {
		testDao.test();
		return string;
	}
}
