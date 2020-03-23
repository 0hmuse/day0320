package com.example.demo.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.GoodsDao;
import com.example.demo.vo.EventVo;
import com.google.gson.Gson;

@RestController
public class EventController {
	
	@Autowired
	private GoodsDao dao;

	public void setDao(GoodsDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value = "listEvent", produces = "application/json;charset=UTF-8")
	public String listAllEvent() {
		String str = "";
		str = (new Gson()).toJson(dao.listEventAll());
		return str;
	}
	
	@RequestMapping("/insertEvent")
	public String insertEvenet(EventVo e) {
		String str = "Schedule";
		dao.insertEvent(e);
		return str;
	}
	
}
