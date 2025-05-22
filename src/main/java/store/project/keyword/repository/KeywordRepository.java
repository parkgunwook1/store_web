package store.project.keyword.repository;

import org.springframework.stereotype.Repository;
import store.project.keyword.vo.Keyword;

import javax.sql.DataSource;
import java.security.Key;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class KeywordRepository {

    private final DataSource dataSource;

    public KeywordRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Keyword> getTopKeywords() {
        String sql = "SELECT keyword FROM keyword.year_keyword_trend ORDER BY (q1_avg + q2_avg + q3_avg + q4_avg) DESC LIMIT 100";
        List<Keyword> result = new ArrayList<>();
        int rank = 0;

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
        ) {
            while (rs.next()) {
                Keyword keyword = new Keyword(rs.getString("keyword") , ++rank);
                result.add(keyword);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
