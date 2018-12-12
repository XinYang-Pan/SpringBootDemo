# Spring Boot 介绍
## Preface
* Spring Tools 4.0
* Lombok
* Spring 生态圈(全家桶) https://spring.io/projects

## 背景
* 传统Spring, 配置多, 集成复杂.
* 简化一切可以简化的操作和配置
* CoC conversion over configuration
* 自动装配(bean, DataSource), 覆盖默认值(WebMvcConfigurer @Configuration)
* 默认配置(application.properties, server.port=8081)
* 依赖集成(类如Spring Thymeleaf)
* 推荐: 基于Java的配置方式(无xml)
* linux 以service 方式启动 类如 service gondor-server start


## 几个集成项目
### Demo中包含的
* Spring Web(Thymeleaf)
* Spring Data JPA
* Spring Data Rest
* Spring Actuator

### Demo中未包含的
* Spring Security
* Spring Session

## 资料
* [纯洁的微笑 Spring-Boot](http://www.ityouknow.com/spring-boot)

# Spring Cloud
## 组件
* 架构(基于Rest同步架构/基于消息的异步架构/Reactive 架构)
* 注册中心
* 熔断器
* 配置中心/AB测试
* 服务网关
* 链路监控/数据埋点


## 资料
* [纯洁的微笑 Spring-Cloud](http://www.ityouknow.com/spring-cloud)
