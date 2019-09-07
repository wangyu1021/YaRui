package com.yarui.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yarui.dao.IndexDao;
import com.yarui.pojo.Shuffling;
import com.yarui.service.IndexService;

@Service
public class IndexServiceImpl implements IndexService {
	@Autowired
	private IndexDao indexDao;
	
	public List<Shuffling> findShuffling() {
		return indexDao.selectShuffling();
	}

	public void updateShuffling(String url,Integer id) {
		indexDao.updateShuffling(url,id);
	}

}
