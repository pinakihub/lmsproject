package com.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.dao.SuggestDao;
import com.lms.model.Suggest;

@Service
public class SuggestServiceImpl implements SuggestService {
	@Autowired
	private SuggestDao sdao;

	@Override
	public List<Suggest> getAllSuggestion() {
		// TODO Auto-generated method stub
		return sdao.findAll();
	}

	@Override
	public Suggest getSuggestions(long suggestId) {
		// TODO Auto-generated method stub
		return sdao.getOne(suggestId);
	}

	@Override
	public Suggest addSuggest(Suggest s) {
		// TODO Auto-generated method stub
		return sdao.save(s);
	}

	@Override
	public Suggest updateSuggest(Suggest s) {
		// TODO Auto-generated method stub
		return sdao.save(s);
	}

	@Override
	public void deleteSuggest(long suggestId) {
		// TODO Auto-generated method stub
		sdao.deleteById(suggestId);
	}

}
