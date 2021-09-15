package com.store.book.BookStore.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = IndexController.class)
public class HomeControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void home_return() throws Exception {
        //when
        String home = "home";

        //then
        mvc.perform(get("/home"))
                .andExpect(status().isOk())
                .andExpect(content().string(home));
    }
}