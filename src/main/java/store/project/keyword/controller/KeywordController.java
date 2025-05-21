package store.project.keyword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import store.project.keyword.service.KeywordService;
import store.project.keyword.vo.Keyword;

import java.util.List;

@RequestMapping("/keywords")
@Controller
public class KeywordController {

    private final KeywordService keywordService;

    public KeywordController(KeywordService keywordService) {
        this.keywordService = keywordService;
    }
    /** gpt를 통해 키워드 생성 요청
     *
     */
    @PostMapping("/generate")
    public List<Keyword> generateKeywords(String prompt) {

        return keywordService.generateKeywords(prompt);
    }

    /** GET /keywords/search-trend: 키워드별 검색량 트렌드 데이터 조회
     *
     */
    @GetMapping("/search-trend")
    public List<Keyword> getSearchTrend(String prompt) {

        return keywordService.getSearchTrend(prompt);
    }


    /** GET /keywords/click-trend: 키워드별 클릭 트렌드 데이터 조회
     *
     */
    @GetMapping("/click-trend")
    public List<Keyword> getClickTrend(String prompt) {

        return keywordService.getClickTrend(prompt);
    }

    /** GET /keywords/top: 인기 키워드 TOP 100 같은 랭킹 제공
     *
     */
    @GetMapping("/top")
    public List<Keyword> getTopKeywords() {

        return keywordService.getTopKeywords();
    }

    /** GET /keywords/similar: 유사 키워드 추천 (연관 키워드 등)
     *
     */
}
