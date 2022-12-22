package com.lms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblsuggest")
public class Suggest {
	@Id
	@Column(name = "SuggestId")
	private long suggestId;
	@Column(name = "BookName")
	private String suggestBookName;
	@Column(name = "AuthorName")
	private String suggestAuthorName;

	public Suggest(int suggestId, String suggestBookName, String suggestAuthorName) {
		super();
		this.suggestId = suggestId;
		this.suggestBookName = suggestBookName;
		this.suggestAuthorName = suggestAuthorName;
	}

	public Suggest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getSuggestId() {
		return suggestId;
	}

	public void setSuggestId(int suggestId) {
		this.suggestId = suggestId;
	}

	public String getSuggestBookName() {
		return suggestBookName;
	}

	public void setSuggestBookName(String suggestBookName) {
		this.suggestBookName = suggestBookName;
	}

	public String getSuggestAuthorName() {
		return suggestAuthorName;
	}

	public void setSuggestAuthorName(String suggestAuthorName) {
		this.suggestAuthorName = suggestAuthorName;
	}

	@Override
	public String toString() {
		return "Suggest [suggestId=" + suggestId + ", suggestBookName=" + suggestBookName + ", suggestAuthorName="
				+ suggestAuthorName + "]";
	}

}
