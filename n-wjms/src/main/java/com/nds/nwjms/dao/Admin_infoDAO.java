package com.nds.nwjms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nds.nwjms.vo.Admin_infoVO;

@Repository
public interface Admin_infoDAO {
	public List<Admin_infoVO> selectAdmin_infoList() throws Exception;
}
