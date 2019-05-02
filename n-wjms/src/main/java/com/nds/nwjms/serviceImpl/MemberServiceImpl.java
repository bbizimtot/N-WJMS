package com.nds.nwjms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nds.nwjms.dao.MemberDAO;
import com.nds.nwjms.service.MemberService;
import com.nds.nwjms.vo.MemberVO;


@Repository
@Service("MemberService")
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDAO MemberMapper;
	
	@Override
	@Transactional
	public MemberVO memberlogin(MemberVO membervo) throws Exception{
		return MemberMapper.memberlogin(membervo);
	}
}
