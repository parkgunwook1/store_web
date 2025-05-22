package store.project.keyword.vo;

public class Keyword {

    private String keywordName;
    private int rank;

    public Keyword(String keywordName , int rank) {
        this.keywordName = keywordName;
        this.rank = rank;
    }
    @Override
    public String toString() {
        return "Keyword{" +
                "keywordName='" + keywordName + '\'' +
                ", rank=" + rank +
                '}';
    }
}
