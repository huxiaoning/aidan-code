package org.aidan.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;

/**
 * @author Aidan
 * @创建时间：2018/11/12 下午2:32
 * @描述: HomeControllerTest
 */
public class HomeControllerTest {

    /**
     * 对 HomeController 的 home方法 进行单元测试
     */
    @Test
    public void testHomePage() {
        HomeController homeController = new HomeController();
        StandaloneMockMvcBuilder builder = MockMvcBuilders.standaloneSetup(homeController);
        MockMvc mockMvc = builder.build();
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/"))
                    .andExpect(MockMvcResultMatchers.view().name("home"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testHomePage1() {
        HomeController homeController = new HomeController();
        StandaloneMockMvcBuilder builder = MockMvcBuilders.standaloneSetup(homeController);
        MockMvc mockMvc = builder.build();
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/homepage"))
                    .andExpect(MockMvcResultMatchers.view().name("home"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
