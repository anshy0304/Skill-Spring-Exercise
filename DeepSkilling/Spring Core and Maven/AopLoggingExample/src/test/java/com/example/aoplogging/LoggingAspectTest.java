package com.example.aoplogging;

import com.example.aoplogging.service.LibraryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(OutputCaptureExtension.class)
class LoggingAspectTest {

    @Autowired
    private LibraryService libraryService;

    @Test
    void serviceMethodShouldBeLogged(CapturedOutput output) {
        String result = libraryService.getBookInfo("The Hobbit");

        assertThat(result).contains("The Hobbit");
        assertThat(output).contains("Executing method");
        assertThat(output).contains("Completed method");
    }
}
