package day12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

class JavaKeyWord {
    private String keyword;
    private String korean;
    private int level;

    @Override
    public String toString() {
        return keyword + "," + korean + "," + level;
    }
}
