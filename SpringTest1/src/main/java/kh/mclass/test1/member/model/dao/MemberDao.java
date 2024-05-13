package kh.mclass.test1.member.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.mclass.test1.member.model.dto.MemberRes;

@Repository("memberDao")
public class MemberDao {
	@Autowired
	private SqlSession sqlSession;
	// root-context.xml에서 sqlSession을 끌고온 것(id가 같아서 끌고올 수 있음)
	public List<MemberRes> selectList(){
		
		return sqlSession.selectList("Member.list"); 
	}

	public MemberRes selectOne(String memId) {
		return sqlSession.selectOne("Member.one", memId);
	}
	
	public int insert() {
//		sqlSession.insert("Member.insert");
		return 0;
	}
	
	public int update() {
//		sqlSession.insert("Member.update");
		return 0;
	}
}
