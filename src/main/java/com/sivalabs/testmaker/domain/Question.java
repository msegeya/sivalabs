/**
 * 
 */
package com.sivalabs.testmaker.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author skatam
 *
 */
public class Question {
	private int id;
	private QuestionType questionType;
	private String questionText;
	private List<Option> options = new ArrayList<Option>();
	private Option answer;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public QuestionType getQuestionType() {
		return questionType;
	}
	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	public Option getAnswer() {
		return answer;
	}
	public void setAnswer(Option answer) {
		this.answer = answer;
	}
	
	
}
