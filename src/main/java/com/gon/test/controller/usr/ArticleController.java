package com.gon.test.controller.usr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gon.test.dto.Article;
import com.gon.test.service.ArticleService;

@Controller
public class ArticleController {
	@Autowired
	ArticleService articleService;
	@RequestMapping("/usr/board/list")
	public String showList(Model model) {
		List<Article> articles = articleService.getArticles();
//		boards.add(new Board(1, "2022-04-21 14:16:00", "2022-04-21 14:16:00", "제목3", "내용3"));
//		boards.add(new Board(2, "2022-04-21 14:16:00", "2022-04-21 14:16:00", "제목3", "내용3"));
		
		model.addAttribute("articles", articles);
		return "usr/board/list";
	}
}
