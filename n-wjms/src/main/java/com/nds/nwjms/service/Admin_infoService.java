package com.nds.nwjms.service;

import java.util.List;

import com.nds.nwjms.vo.Admin_infoVO;

public interface Admin_infoService {
	public List<Admin_infoVO> selectAdmin_infoList() throws Exception;
}
