package amao.autoconfigure;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-09-20 15:46
 */
@EnableAutoConfiguration
public class FormatterBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(FormatterBootstrap.class)
                .web(WebApplicationType.NONE) //非web应用
                .run(args); //运行
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("name", "hello");
        Formatter formatter = context.getBean(Formatter.class);
        System.out.println("formatter:" + formatter.format(data));
        context.close();//关闭当前上下文
    }
}
