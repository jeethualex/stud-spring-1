package com.stud.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CheckHTTPResponse {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void shouldPassIfStringMatches(){
        assertEquals("Hello from spring boot.", testRestTemplate.getForObject("http://localhost:"+port+"/", String.class));
    }

    @Test
    public void shouldPassIfStringMatches1(){
        assertEquals("Goodbye from spring boot.", testRestTemplate.getForObject("http://localhost:"+port+"/goodbye", String.class));
    }
}
