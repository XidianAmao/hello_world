package stu.yang.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.config.TriggerTask;
import org.springframework.scheduling.support.CronTrigger;
import stu.yang.spider.AutoNewsCrawler;

@Configuration
@EnableScheduling
public class SpiderConfig implements SchedulingConfigurer {

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {

        // 定时任务执行爬虫
        TriggerTask triggrtTask = new TriggerTask(
                () -> {
                    AutoNewsCrawler crawler = new AutoNewsCrawler("crawl", true);

                    //启动爬虫
                    try {
                        crawler.start(4);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                },
                // 设置触发器，这里是一个拉姆达表达式，传入的TriggerContext类型，返回的是Date类型
                triggerContext -> {
                    // 2.3 返回执行周期(Date)
                    return new CronTrigger("0 0 2 * * ?").nextExecutionTime(triggerContext);
                });

        taskRegistrar.addTriggerTask(triggrtTask);

    }


}
