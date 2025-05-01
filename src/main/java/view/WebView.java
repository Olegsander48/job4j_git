package view;

import java.util.List;

public class WebView {
    private void showData(List<String> names) {
        names.stream()
                .map(s -> s.split(":")[0])
                .forEach(System.out::println);
    }
}
