package com.nds.nwjms.dao;

import org.springframework.stereotype.Repository;

import com.nds.nwjms.vo.MemberVO;

@Repository
public interface MemberDAO {
	public MemberVO memberlogin(MemberVO membervo) throws Exception;
}
