package com.example.campus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.campus.entity.Questions;
import com.example.campus.service.QuestionService;

//フロントエンドとサーバーサイドの入出力の管理を行う
@Controller
public class RegisterController {

	/**
     * Questionサービスクラスへのアクセス
     */
	@Autowired
	private QuestionService service;

	/**
	 * 登録画面に遷移する
	 * @return 登録画面へのパス
	 */
	//question
	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("questionForm", new Questions());
		return "register";
	}

	/**
	 * 確認画面に遷移する
	 * @return 確認画面へのパス
	 */
	//question
	@PostMapping("/confirm")
	public String confirm(@ModelAttribute Questions questions, Model model) {
		model.addAttribute("questionForm", questions);
		return "confirm";
	}

	/**
	 * 一覧画面に遷移する
	 * @return 一覧画面へのパス
	 */
	//question
	@PostMapping("/insert")
	public String insertQuestin(@ModelAttribute Questions questions, Model model) {
		//insert
		service.insertQuestion(questions);
		return "redirect:/list";
	}



}
