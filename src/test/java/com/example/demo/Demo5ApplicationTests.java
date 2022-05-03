package com.example.demo;

import com.example.demo.domain.Book;
import com.example.demo.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo5ApplicationTests {

    @Autowired
    BookMapper bookMapper;

    @Test
    void contextLoads() {
        Book book = bookMapper.selectByPrimaryKey(3);
        System.out.println(book);

    }

}
