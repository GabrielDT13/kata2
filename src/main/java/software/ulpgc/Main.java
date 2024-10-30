package software.ulpgc;

import java.io.File;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TsvTitleReader reader = new TsvTitleReader(new File("./title.basics.tsv"));
        HashMap<Title.TitleType, Integer> histogram = generateHistogram(reader);

        showHistogram(histogram);
    }

    private static void showHistogram(HashMap<Title.TitleType, Integer> histogram) {
        for(Title.TitleType titleType : histogram.keySet()){
            System.out.println(titleType + " " + histogram.get(titleType));
        }
    }

    private static HashMap<Title.TitleType, Integer> generateHistogram(TsvTitleReader reader) {
        List<Title> titles = reader.read();
        return new HistogramGenerator().generate(titles);
    }
}
