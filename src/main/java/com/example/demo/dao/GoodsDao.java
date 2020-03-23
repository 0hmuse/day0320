package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.GoodsManager;
import com.example.demo.vo.CartVo;
import com.example.demo.vo.ChatVo;
import com.example.demo.vo.EventVo;
import com.example.demo.vo.GoodsVo;
import com.example.demo.vo.MemberVo;

@Repository
public class GoodsDao {
	public List<GoodsVo> listAll(){
		return GoodsManager.listAll();
	}
	public List<ChatVo> listChatAll(){
		return GoodsManager.listChat();
	}
	public int insertChat(ChatVo c) {
		return GoodsManager.insertChat(c);
	}
	
	
	public List<EventVo> listEventAll(){
		return GoodsManager.listAllEvent();
	}
	public int insertEvent(EventVo e) {
		return GoodsManager.insertEvent(e);
	}
	
	
	public int insertCart(CartVo cv) {
		return GoodsManager.insertCart(cv);
	}
	
	public MemberVo login(MemberVo mv) {
		return GoodsManager.login(mv);
	}
	
}
