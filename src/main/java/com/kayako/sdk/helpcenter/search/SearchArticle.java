package com.kayako.sdk.helpcenter.search;

import com.kayako.sdk.helpcenter.articles.Article;
import com.kayako.sdk.helpcenter.base.Resource;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 26/08/16
 */
public class SearchArticle implements Resource {

    private String title;

    private String categoryName;

    private String sectionName;

    private Article originalArticle;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public Article getOriginalArticle() {
        return originalArticle;
    }

    public void setOriginalArticle(Article originalArticle) {
        this.originalArticle = originalArticle;
    }
}