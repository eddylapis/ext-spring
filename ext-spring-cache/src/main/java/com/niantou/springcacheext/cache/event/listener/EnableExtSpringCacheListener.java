package com.niantou.springcacheext.cache.event.listener;

import com.niantou.springcacheext.author.JustryDeng;
import com.niantou.springcacheext.cache.constant.ExtCacheConfigPlaceholderBase;
import com.niantou.springcacheext.cache.event.EnableExtSpringCacheEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;

/**
 * 监听EnableExtSpringCacheEvent
 *
 * @author {@link JustryDeng}
 * @since 2020/11/7 15:04:33
 */
@Slf4j
public class EnableExtSpringCacheListener implements ApplicationListener<EnableExtSpringCacheEvent> {
    
    public static final String BEAN_NAME = "enableExtSpringCacheListener";
    
    @Value(ExtCacheConfigPlaceholderBase.PRINT_BANNER_PLACEHOLDER)
    private boolean printBanner;
    
    private static final String BANNER = " ________          _     ______                    _                     "
            + "______                __             \n"
            + "|_   __  |        / |_ .' ____ \\                  (_)                  .' ___  |              [  |   "
            + "         \n"
            + "  | |_ \\_| _   __`| |-'| (___ \\_|_ .--.   _ .--.  __   _ .--.   .--./)/ .'   \\_| ,--.   .---.  | "
            + "|--.  .---.  \n"
            + "  |  _| _ [ \\ [  ]| |   _.____`.[ '/'`\\ \\[ `/'`\\][  | [ `.-. | / /'`\\;| |       `'_\\ : / /'`\\] "
            + "| .-. |/ /__\\\\ \n"
            + " _| |__/ | > '  < | |, | \\____) || \\__/ | | |     | |  | | | | \\ \\._//\\ `.___.'\\// | |,| \\__.  "
            + "| | | || \\__., \n"
            + "|________|[__]`\\_]\\__/  \\______.'| ;.__/ [___]   [___][___||__].',__`  `.____ .'\\'-;__/'.___"
            + ".'[___]|__]'.__.' \n"
            + "                                [__|                          ( ( __))                                "
            + "        by JustryDeng";
    
    @Override
    @SuppressWarnings("NullableProblems")
    public void onApplicationEvent(EnableExtSpringCacheEvent event) {
        if (printBanner) {
            log.info("\n -> {}", BANNER);
        }
    }
}
