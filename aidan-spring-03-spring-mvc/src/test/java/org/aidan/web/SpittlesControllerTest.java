package org.aidan.web;

import org.aidan.data.SpittleRepository;
import org.aidan.entity.Spitte;
import org.aidan.util.BeanUtil;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author Aidan
 * @创建时间：2018/11/13 上午10:27
 * @描述: SpittleControllerTest
 */
public class SpittlesControllerTest {

    @Test
    public void shouldShowRecentSpittles() {
        // 1 期待的结果
        List<Spitte> expectSpittles = createSpittleList(20);
        // SpittleRepository接口没有实现，Mock一个实现
        SpittleRepository repository = Mockito.mock(SpittleRepository.class);
        // 让这个Mock的repository在调用repository.findSpittles(Long.MAX_VALUE, 20)的时候返回的结果为 1中的expectSpittles
        Mockito.when(repository.findSpittles(Long.MAX_VALUE, 20))
                .thenReturn(expectSpittles);

        SpittlesController spittleController = new SpittlesController();

        try {
            // 相当于 spittleController.setSpittleRepository(repository);  但一般控制器不提供注入属性的set方法
            BeanUtil.setProperty(spittleController, "spittleRepository", repository);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(spittleController)
                .setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))
                .build();

        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/spittles"))
                    .andExpect(MockMvcResultMatchers.view().name("spittles"))
                    .andExpect(MockMvcResultMatchers.model().attributeExists("spittleList"))
                    .andExpect(MockMvcResultMatchers.model().attribute("spittleList", CoreMatchers.hasItems(expectSpittles.toArray())))
            ;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private List<Spitte> createSpittleList(int count) {
        List<Spitte> spittleList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            spittleList.add(new Spitte("Spittle" + i, new Date()));
        }
        return spittleList;
    }

    /**
     * 测试发送参数
     */
    @Test
    public void test2() {
        List<Spitte> expectSpittles = createSpittleList(50);
        SpittleRepository spittleRepository = Mockito.mock(SpittleRepository.class);
        Mockito.when(spittleRepository.findSpittles(238900L, 50))
                .thenReturn(expectSpittles);
        SpittlesController spittleController = new SpittlesController();
        try {
            BeanUtil.setProperty(spittleController, "spittleRepository", spittleRepository);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(spittleController)
                .setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))
                .build();

        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/spittles?max=238900&count=50"))
                    .andExpect(MockMvcResultMatchers.view().name("spittles"))
                    .andExpect(MockMvcResultMatchers.model().attributeExists("spittleList"))
                    .andExpect(MockMvcResultMatchers.model().attribute("spittleList", CoreMatchers.hasItems(expectSpittles.toArray())))
            ;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testSpittle() {
        Spitte expectedSpittle = new Spitte("Hello", new Date());
        SpittleRepository spittleRepository = Mockito.mock(SpittleRepository.class);

        Mockito.when(spittleRepository.findOne(12345L)).thenReturn(expectedSpittle);

        SpittlesController spittleController = new SpittlesController();
        try {
            BeanUtil.setProperty(spittleController, "spittleRepository", spittleRepository);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(spittleController)
                .setSingleView(new InternalResourceView("/WEB-INF/views/spittle.jsp"))
                .build();

        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/spittles/show/12345"))
                    .andExpect(MockMvcResultMatchers.view().name("spittle"))
                    .andExpect(MockMvcResultMatchers.model().attributeExists("spittle"))
                    .andExpect(MockMvcResultMatchers.model().attribute("spittle", expectedSpittle))
            ;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
