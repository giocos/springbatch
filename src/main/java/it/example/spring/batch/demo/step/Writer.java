package it.example.spring.batch.demo.step;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class Writer implements ItemWriter<String> {

    @Override
    public void write(List<? extends String> messages) {
        for (final String m : messages) {
            System.out.println("Writing item: " + m);
        }
        System.out.println("# --------------------");
    }
}
