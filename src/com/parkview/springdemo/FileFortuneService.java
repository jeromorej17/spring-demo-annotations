package com.parkview.springdemo;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {

    private String[] data;
    private Random myRandom = new Random();
    private File file = new File("src/fortunes.txt");

    @Override
    public String getFortune(){
        String fortune = "";

        try{
            data = readFile(file.getPath());
            int index = myRandom.nextInt(data.length);
            fortune = data[index];
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }

        return fortune;
    }

    private String[] readFile(String filename) throws IOException {
         List<String> fortunes = Files.readAllLines(Paths.get(filename));
         return fortunes.toArray(new String[fortunes.size()]);
    }

}
