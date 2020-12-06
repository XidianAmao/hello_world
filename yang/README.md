# 内容模块
## 一、业务功能模块
Reactor编程模型
Scheduler 表示背后驱动反应式流的调度器，通常由各种线程池实现。
Mono 实现了 org.reactivestreams.Publisher 接口，代表0到1个元素的发布者。
Flux 同样实现了 org.reactivestreams.Publisher 接口，代表0到N个元素的发表者。
Reactive Streams 是规范，Reactor 实现了 Reactive Streams。
Web Flux 以 Reactor 为基础，实现 Web 领域的反应式编程框架。

其实，对于大部分业务开发人员来说，当编写反应式代码时，我们通常只会接触到 Publisher 这个接口，对应到 Reactor 便是 Mono 和 Flux。
对于 Subscriber 和 Subcription 这两个接口，Reactor 必然也有相应的实现。
但是，这些都是 Web Flux 和 Spring Data Reactive 这样的框架用到的。
如果不开发中间件，通常开发人员是不会接触到的。

比如，在 Web Flux，你的方法只需返回 Mono 或 Flux 即可。
你的代码基本也只和 Mono 或 Flux 打交道。
而 Web Flux 则会实现 Subscriber ，onNext 时将业务开发人员编写的 Mono 或 Flux 转换为 HTTP Response 返回给客户端。

## 二、用户模块
JWT

## 三、爬虫部分
WebCollector
TODO：数据存取

## 四、模型部分 与 数据计算
TODO: 数据计算

