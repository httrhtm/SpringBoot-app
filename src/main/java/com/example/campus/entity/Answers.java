package com.example.campus.entity;

import java.sql.Timestamp;

//entityクラス
public class Answers {

	private int id;
	private int questions_id;
	private String answer;
	private Timestamp created_at;
	private Timestamp updated_at;

	public Answers (int questions_id, String answer) {
		this.setId(id);
		this.setQuestionsId(questions_id);
		this.setAnswer(answer);
	}

	public Answers() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuestionsId() {
		return questions_id;
	}
	public void setQuestionsId(int questions_id) {
		this.questions_id = questions_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Timestamp getCreatedAt() {
		return created_at;
	}
	public void setCreatedAt(Timestamp created_at) {
		this.created_at = created_at;
	}
	public Timestamp getUpdatedAt() {
		return updated_at;
	}
	public void setUpdatedAt(Timestamp updated_at) {
		this.updated_at = updated_at;
	}




}
