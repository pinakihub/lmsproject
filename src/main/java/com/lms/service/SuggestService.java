package com.lms.service;

import java.util.List;

import com.lms.model.Suggest;

public interface SuggestService {
	public List<Suggest> getAllSuggestion();

	public Suggest getSuggestions(long suggestId);
	public Suggest addSuggest(Suggest c);
	public Suggest updateSuggest(Suggest c);
	public void deleteSuggest(long suggestId);
}
