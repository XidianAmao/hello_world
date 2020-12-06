package stu.yang.spider;

import cn.edu.hfut.dmic.webcollector.model.CrawlDatums;
import cn.edu.hfut.dmic.webcollector.model.Page;
import cn.edu.hfut.dmic.webcollector.plugin.berkeley.BreadthCrawler;


public class AutoNewsCrawler extends BreadthCrawler {

    public AutoNewsCrawler(String crawlPath, boolean autoParse) {
        super(crawlPath, autoParse);

        //种子页面，起始页面
        this.addSeed("http://news.hfut.edu.cn/list-1-1.html");

        //正则规则设置 寻找符合http://news.hfut.edu.cn/show-xxxxxxhtml的url
        this.addRegex("http://news.hfut.edu.cn/show-.*html");

        this.addRegex("-.*\\.(jpg|png|gif).*");

        //不要爬取包含 #的URL
        this.addRegex("-.*#.*");

        //线程数
        setThreads(50);

        //设置每次迭代中爬取数量的上限
        getConf().setTopN(100);

        //设置是否为断点爬取，如果设置为false，任务启动前会清空历史数据。
        //如果设置为true，会在已有crawlPath(构造函数的第一个参数)的基础上继
        //续爬取。对于耗时较长的任务，很可能需要中途中断爬虫，也有可能遇到
        //死机、断电等异常情况，使用断点爬取模式，可以保证爬虫不受这些因素
        //的影响，爬虫可以在人为中断、死机、断电等情况出现后，继续以前的任务
        //进行爬取。断点爬取默认为false*/
//        setResumable(true);
    }

    /**
     * visit函数定制访问每个页面时所需进行的操作
     */
    @Override
    public void visit(Page page, CrawlDatums next) {
        String url = page.url();

        //如果页面地址如何我们要求
        if (page.matchUrl("http://news.hfut.edu.cn/show-.*html")) {

            //获取url标题
            String title = page.select("div[id=Article]>h2").first().text();

            String content = page.selectText("div#artibody");

            //地址
            System.out.println("URL:\n" + url);

            //标题
            System.out.println("title:\n" + title);

            //内容
            System.out.println("content:\n" + content);

                        /*如果你想添加新的爬取任务，可以向next中添加爬取任务，
               这就是上文中提到的手动解析*/
            /*WebCollector会自动去掉重复的任务(通过任务的key，默认是URL)，
              因此在编写爬虫时不需要考虑去重问题，加入重复的URL不会导致重复爬取*/
            /*如果autoParse是true(构造函数的第二个参数)，爬虫会自动抽取网页中符合正则规则的URL，
              作为后续任务，当然，爬虫会去掉重复的URL，不会爬取历史中爬取过的URL。
              autoParse为true即开启自动解析机制*/
            //next.add("http://xxxxxx.com");
        }
    }

    public static void main(String[] args) throws Exception {


    }

}