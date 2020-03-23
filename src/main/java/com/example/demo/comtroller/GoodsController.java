package com.example.demo.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.GoodsDao;
import com.example.demo.vo.CartVo;
import com.example.demo.vo.MemberVo;
import com.google.gson.Gson;

@RestController	
public class GoodsController {
	
	@Autowired
	private GoodsDao dao;
		
	public void setDao(GoodsDao dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/goodsList", produces = "application/json;charset=UTF-8")
	public String goodsList() {
		String str = "";
		str = (new Gson()).toJson(dao.listAll());
		return str;
	}
	
	@RequestMapping("/insertCart")
	public String insertCart(CartVo cv) {
		String str = "ok";
		dao.insertCart(cv);
		System.out.println("장바구니에 담긴 상품번호: "+ cv.getGno());
		return str;
	}
	
	@RequestMapping("/login")
	public String login(MemberVo m) {
		String str = "no";		
		MemberVo mv = dao.login(m);		
		if(mv != null) {
			System.out.println("로그인 성공");
			str = m.getId();
		}else {
			System.out.println("로그인 실패");
		}		
		return str;
	}
}
