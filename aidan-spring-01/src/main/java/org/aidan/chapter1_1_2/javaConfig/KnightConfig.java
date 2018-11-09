package org.aidan.chapter1_1_2.javaConfig;

import org.aidan.chapter1_1_2.BraveKnight;
import org.aidan.chapter1_1_2.Knight;
import org.aidan.chapter1_1_2.Quest;
import org.aidan.chapter1_1_2.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Aidan
 * @创建时间：2018/11/9 下午2:27
 * @描述: spring java config
 */
@Configuration
public class KnightConfig {

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Knight knight(Quest quest) {
        return new BraveKnight(quest);
    }
}
