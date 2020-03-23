package com.example.demo.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.GoodsDao;
import com.example.demo.vo.ChatVo;
import com.google.gson.Gson;

@RestController
public class CahtController {

	@Autowired
	private GoodsDao dao;	
	
	public void setDao(GoodsDao dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/chatList", produces = "application/json;charset=UTF-8")
	public String chatList() {
		String str ="";
		str = (new Gson()).toJson(dao.listChatAll());
		return str;
	}
	
	@RequestMapping("/chatInsert")
	public String insertChat(ChatVo c) {
		String str = "ok";
		dao.insertChat(c);
		return str;
	}
}
