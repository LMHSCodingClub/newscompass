package com.lmhscodingclub.newscompass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewsStory {
    private ArrayList<NewsArticle> articles;
    private Map<PoliticalBias, List<NewsArticle>> groupedArticles;

    public NewsStory(ArrayList<NewsArticle> arts) {
        articles = arts;
        groupedArticles = articles.stream().collect(Collectors.groupingBy(a -> a.newspaper().leaning()));
    }

    public List<NewsArticle> getLeftLeaningStories() {
        return groupedArticles.get(PoliticalBias.LEFT);
    }

    public List<NewsArticle> getCenterStories() {
        return groupedArticles.get(PoliticalBias.CENTER);
    }

    public List<NewsArticle> getRightStories() {
        return groupedArticles.get(PoliticalBias.RIGHT);
    }
}
