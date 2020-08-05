package com.revature.model;

public class Flashcard {
int flashcard_id;
String question;
String answer;
int category_id;

	public Flashcard() {
		super(); 
		
	}

	@Override
	public String toString() {
		return "Flashcard [flashcard_id=" + flashcard_id + ", question=" + question + ", answer=" + answer
				+ ", category_id=" + category_id + "]";
	}

	public int getFlashcard_id() {
		return flashcard_id;
	}

	public void setFlashcard_id(int flashcard_id) {
		this.flashcard_id = flashcard_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public Flashcard(int flashcard_id, String question, String answer, int category_id) {
		super();
		this.flashcard_id = flashcard_id;
		this.question = question;
		this.answer = answer;
		this.category_id = category_id;
	}
	
	
}