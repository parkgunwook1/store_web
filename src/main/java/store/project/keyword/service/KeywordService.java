package store.project.keyword.service;

import org.springframework.stereotype.Service;
import store.project.keyword.repository.KeywordRepository;
import store.project.keyword.vo.Keyword;

import java.util.List;

@Service
public class KeywordService {

    private KeywordRepository keywordRepository;

    public KeywordService(KeywordRepository keywordRepository) {
        this.keywordRepository = keywordRepository;
    }

    public List<Keyword> generateKeywords(String prompt) {

        return null;
    }

    public List<Keyword> getSearchTrend(String prompt) {

        return null;
    }

    public List<Keyword> getClickTrend(String prompt) {

        return null;
    }

    public List<Keyword> getTopKeywords() {

        return null;
    }
}
