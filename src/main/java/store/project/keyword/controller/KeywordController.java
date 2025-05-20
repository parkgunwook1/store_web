package store.project.keyword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import store.project.keyword.vo.Keyword;

import java.util.List;

@RequestMapping("/keywords")

public class KeywordController {


    /** gpt를 통해 키워드 생성 요청
     *
     */
    @PostMapping("/generate")
    public List<Keyword> makeGenerate(String prompt) {

        return null;
    }

    /** GET /keywords/search-trend: 키워드별 검색량 트렌드 데이터 조회
     *
     */


    /** GET /keywords/click-trend: 키워드별 클릭 트렌드 데이터 조회
     *
     */

    /** GET /keywords/top: 인기 키워드 TOP 100 같은 랭킹 제공
     *
     */

    /** GET /keywords/similar: 유사 키워드 추천 (연관 키워드 등)
     *
     */
}
