package com.edugroupe.vdp.mesencheres.actions;

import java.util.List;

import com.edugroupe.vdp.mesencheres.metier.Article;
import com.edugroupe.vdp.mesencheres.repositories.ArticleRepository;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class ArticleAction extends ActionSupport implements ModelDriven<Article> {

	Article article;
	List<Article> articles;
	ArticleRepository articleRepository;
	
	
	
	public void setArticleRepository(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	public List<Article> getArticles() {
		return articles;
	}

	boolean sucessOperation;
	
	@Override
	public Article getModel() {
		if (article == null)
			article = new Article();
		return article;
	}

	public boolean isSucessOperation() {
		return sucessOperation;
	}
	
	String insert(){
		Article a = articleRepository.save(article);
		if (a==null)
			sucessOperation = false;
		return SUCCESS;
	}
	String delete(){
		articleRepository.delete(article.getId());
		return SUCCESS;
	}
	String update(){
		Article a = articleRepository.save(article);
		if (a==null)
			sucessOperation = false;
		return SUCCESS;
	}
	String show(){
		Article a = articleRepository.findOne(article.getId());
		if (a==null)
			return SUCCESS;
		getModel().setId(a.getId());
		getModel().setDescription(a.getDescription());
		getModel().setEnchereMinimum(a.getEnchereMinimum());
		getModel().setMiseDeDepart(a.getMiseDeDepart());
		getModel().setNom(a.getNom());
		sucessOperation = true;
		return SUCCESS;
	}
	

}
