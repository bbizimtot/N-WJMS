package com.nds.nwjms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nds.nwjms.dao.Emp_infoDAO;
import com.nds.nwjms.service.Emp_infoService;
import com.nds.nwjms.vo.Emp_infoVO;


@Repository
@Service("emp_infoService")
public class Emp_infoServiceImpl implements Emp_infoService {
	
	@Autowired
	private Emp_infoDAO emp_infoMapper;

	@Override
	@Transactional
	public List<Emp_infoVO> selectEmp_infoList() throws Exception {
		return emp_infoMapper.selectEmp_infoList();
	}

}
