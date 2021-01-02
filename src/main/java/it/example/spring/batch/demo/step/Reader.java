package it.example.spring.batch.demo.step;

import org.springframework.batch.item.ItemReader;

import java.util.Arrays;
import java.util.List;

public class Reader implements ItemReader<String> {

    private final List<String> items = Arrays.asList("Welcome", "to", "first",
            "Spring", "Batch", "Example");
    private int index = 0;

    @Override
    public String read() {
        if (index < items.size()) {
            System.out.println("Read item: " + items.get(index));
            return items.get(index++);
        }
        return null;
    }

}
