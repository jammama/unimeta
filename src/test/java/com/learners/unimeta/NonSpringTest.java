package com.learners.unimeta;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NonSpringTest {

    @Test
    public void test() throws IOException {
        Path from = Paths.get("C:/file", "text.txt"); //convert from File to Path
        Path to = Paths.get("C:/move", "text3.txt"); //convert from String to Path
        Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        assert true;
    }
}
