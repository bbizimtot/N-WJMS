package com.nds.nwjms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nds.nwjms.vo.Emp_infoVO;

@Repository
public interface Emp_infoDAO {
	public List<Emp_infoVO> selectEmp_infoList() throws Exception;
}
