package it.example.spring.batch.demo.step;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String, String> {

    private static final String EMPTY = "";
    private int count = 0;

    @Override
    public String process(String message) {
        if (message.length() > 0) {
            System.out.println("Processing item [" + (count++) + "]");
            return message.toUpperCase();
        }
        return EMPTY;
    }
}
