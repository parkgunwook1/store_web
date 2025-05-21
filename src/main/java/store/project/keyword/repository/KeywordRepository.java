package store.project.keyword.repository;

import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class KeywordRepository {

    private final DataSource dataSource;

    public KeywordRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }


}
