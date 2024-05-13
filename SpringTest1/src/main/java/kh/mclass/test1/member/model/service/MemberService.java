package kh.mclass.test1.member.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.mclass.test1.member.model.dao.MemberDao;
import kh.mclass.test1.member.model.dto.MemberRes;

@Service("memberService")
@Transactional
public class MemberService {
	@Autowired
	private MemberDao memberDao;
	// @Transactional
	public List<MemberRes> selectList(){
		memberDao.insert();
		memberDao.update();
		
		return memberDao.selectList();
	}
	
	public void insertAbc() {
		
	}
}
