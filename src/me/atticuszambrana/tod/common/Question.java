package me.atticuszambrana.tod.common;

public class Question {
	
	private String data;
	private QuestionType type;
	
	public Question(String data, QuestionType type) {
		this.data = data;
		this.type = type;
	}
	
	public enum QuestionType {
		EMBARRASSING,
		FUNNY,
		FRIENDSHIP,
		GENERAL,
		FLIRTY,
		DIRTY,
	}
	
	public String getData() {
		return data;
	}
	
	public QuestionType getType() {
		return type;
	}
}
