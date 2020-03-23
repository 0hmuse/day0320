package com.example.demo.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.CartVo;
import com.example.demo.vo.ChatVo;
import com.example.demo.vo.EventVo;
import com.example.demo.vo.GoodsVo;
import com.example.demo.vo.MemberVo;

public class GoodsManager {

	private static SqlSessionFactory factory;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/example/demo/db/sqlMapConpig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static int insertChat(ChatVo c) {
		int re = -1;
		SqlSession session = factory.openSession();
		re = session.insert("chat.insert",c);
		session.commit();
		session.close();
		return re;
	}
	
	
	public static List<ChatVo> listChat(){		 
		SqlSession session = factory.openSession();
		List<ChatVo> list = session.selectList("chat.selectAll");
		session.close();
		return list;
	}
	
	
	public static List<GoodsVo> listAll(){		 
		SqlSession session = factory.openSession();
		List<GoodsVo> list = session.selectList("goods.selectAll");
		session.close();
		return list;
	}
		
	
	
	public static List<EventVo> listAllEvent(){		 
		SqlSession session = factory.openSession();
		List<EventVo> list = session.selectList("event.selectAll");
		session.close();
		return list;
	}
	
	public static int insertEvent(EventVo e) {
		int re = -1;
		SqlSession session = factory.openSession();
		re = session.insert("event.insert",e);
		session.commit();
		session.close();
		return re;
	}
	
	
	public static int insertCart(CartVo cv) {
		int re = -1;
		SqlSession session = factory.openSession();
		re = session.insert("cart.insert", cv);
		session.commit();
		session.close();
		return re;
	}
	
	public static MemberVo login(MemberVo m){
		MemberVo mv = null;
		SqlSession session = factory.openSession();		
		mv = session.selectOne("member.login", m);
		session.close();
		return mv;
		
	}
}
