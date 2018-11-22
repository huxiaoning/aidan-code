package org.aidan.web;

import org.aidan.data.SpitterRepository;
import org.aidan.entity.Spitter;
import org.aidan.util.BeanUtil;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


/**
 * @author Aidan
 * @创建时间：2018/11/14 下午5:14
 * @描述: SpittleControllerTest
 */
public class SpittlerControllerTest {

    /**
     * 测试注册表单展示页面控制器
     */
    @Test
    public void shouldShowRegistration() {
        SpitterController spittleController = new SpitterController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(spittleController).build();
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/spitter/register"))
                    .andExpect(MockMvcResultMatchers.view().name("registerForm"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试提交注册表单信息处理控制器
     */
    @Test
    public void shouldProcessRegistration() {
        SpitterRepository spitterRepository = Mockito.mock(SpitterRepository.class);
        Spitter unsaved = new Spitter("jbauer", "24hours", "Jack", "Bauer");
        Spitter saved = new Spitter(24L, "jbauer", "24hours", "Jack", "Bauer");
        Mockito.when(spitterRepository.save(unsaved)).thenReturn(saved);

        SpitterController spittlerController = new SpitterController();
        try {
            BeanUtil.setProperty(spittlerController, "spitterRepository", spitterRepository);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(spittlerController).build();

        try {
            mockMvc.perform(MockMvcRequestBuilders.post("/spitter/register")
                    .param("firstName", "Jack")
                    .param("lastName", "Bauer")
                    .param("username", "jbauer")
                    .param("password", "24hours")
            ).andExpect(MockMvcResultMatchers.redirectedUrl("/spitter/jbauer"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Mockito.verify(spitterRepository, Mockito.atLeastOnce()).save(unsaved);

    }
}
