package com.nds.nwjms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nds.nwjms.dao.Admin_infoDAO;
import com.nds.nwjms.service.Admin_infoService;
import com.nds.nwjms.vo.Admin_infoVO;


@Repository
@Service("admin_infoService")
public class Admin_infoServiceImpl implements Admin_infoService{
	
	@Autowired
	private Admin_infoDAO admin_infoMapper;
	
	@Override
	@Transactional
	public List<Admin_infoVO> selectAdmin_infoList() throws Exception{
		return admin_infoMapper.selectAdmin_infoList();
		
	}
}
