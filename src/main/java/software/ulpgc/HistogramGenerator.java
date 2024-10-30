package software.ulpgc;

import java.util.HashMap;
import java.util.List;

public class HistogramGenerator {


    public HashMap<Title.TitleType, Integer> generate(List<Title> titles) {
        HashMap<Title.TitleType, Integer> result = new HashMap<>();
        for(Title title: titles){
            result.put(title.titleType(), result.getOrDefault(title.titleType(), 0) +1);
        }

        return result;
    }
}
