package com.kardam.testproject;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = ReactiveProjectApplication.class)
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application-test.properties")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResourceApiControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void TesA_createResouce() throws Exception {

        String resource = "{\"name\":\"r1\",\"resourceType\":\"Incoming\"}";

        mvc.perform(post("/api/resource")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(resource))
                .andExpect(status().isOk())
                .andExpect(content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").isNumber())
                .andExpect(jsonPath("$.name").value("r1"))
                .andExpect(jsonPath("$.resourceType").value("Incoming"));
    }

    @Test
    public void TestB_getResouce() throws Exception {

        mvc.perform(get("/api/resource/{id}", 1)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.name").value("r1"))
                .andExpect(jsonPath("$.resourceType").value("Incoming"));
    }

    @Test
    public void TestC_updateResouce() throws Exception {

        String resource = "{\"id\":1,\"name\":\"r2\",\"resourceType\":\"Outgoing\"}";

        mvc.perform(put("/api/resource/update")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(resource))
                .andExpect(status().isOk())
                .andExpect(content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.name").value("r2"))
                .andExpect(jsonPath("$.resourceType").value("Outgoing"));
    }
    @Test
    public void TestD_deleteResouce() throws Exception {

        mvc.perform(delete("/api/resource/delete/{id}", 1)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void TestE_getResouce_Negative() throws Exception {

        mvc.perform(get("/api/resource/{id}", 1)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

}