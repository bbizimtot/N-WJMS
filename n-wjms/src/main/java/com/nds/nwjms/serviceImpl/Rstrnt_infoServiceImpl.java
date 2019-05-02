package com.nds.nwjms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nds.nwjms.dao.Rstrnt_infoDAO;
import com.nds.nwjms.service.Rstrnt_infoService;
import com.nds.nwjms.vo.Rstrnt_infoVO;


@Repository
@Service("rstrnt_infoService")
public class Rstrnt_infoServiceImpl implements Rstrnt_infoService {

	@Autowired
	private Rstrnt_infoDAO rstrnt_infoMapper;
	
	@Override
	@Transactional
	public List<Rstrnt_infoVO> selectRstrnt_infoList() throws Exception {	
		return rstrnt_infoMapper.selectRstrnt_infoList();
	}

}
