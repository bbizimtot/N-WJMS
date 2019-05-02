package com.nds.nwjms.service;

import java.util.List;

import com.nds.nwjms.vo.Emp_infoVO;

public interface Emp_infoService {
	public List<Emp_infoVO> selectEmp_infoList() throws Exception;
}
