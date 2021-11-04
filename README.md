# myddd-java

myddd-java是**myddd**全栈式领域驱动实践的java部分，用于支持基于java及spring boot的后端开发。

## 快速开始

myddd starter已经开放使用，现在开始，你可以访问[myddd starter](https://starter.myddd.org)以快速开始生成一个myddd项目。

## 致敬

向[dddlib](https://github.com/dayatang/dddlib) 致敬。**myddd-java 1.X版本**来源于[dddlib](https://github.com/dayatang/dddlib).

数年前，我有幸与dddlib开发者杨宇老师一同工作，使用dddlib，讨论DDD，参与dddlib的开发。一晃数年已过。

我与杨宇老师仍保持密切交流。

**myddd-java**来源于dddlib，无论何时，我都会明白无误的说明这一点。 如今杨宇老师已无精力关注dddlib，便决定基于它重整DDD。

> 我已经按照自己对ddd的理解，对myddd-java进行了大范围的重构，因此myddd-java 2.x版本开始，已经与dddlib告别。
> 并且从2.x版本开始，已经按照TDD的方式来开发与维护myddd-java,并且加入了SonarQube质量管控，单元测试覆盖率不少于80%。

## myddd-java的原则与宗旨

myddd-java始终坚持以下两个原则：

1. 最大化的倡导ddd编码风格与模式

2. 把支持Spring Boot做为第一要务。

   > Spring Boot结合Spring Cloud框架，已成为中小企业，个人开发者开发的不二选择。选择支持Spring Boot，也是期望为更多的人与团队服务。在不影响他们的整体架构的选型下，更好的使用DDD

## SonarQube质量报告

当前主干的SonarQube的质量状态为:

![SonarQube质量报告](https://images.taoofcoding.tech/2021/11/sonar_data_of_myddd_java.png)


## 为什么叫myddd

ddd领域驱动的理念较为复杂，概念较多。包含实体，值对象，仓储，领域服务，领域事件，聚合根，应用服务，查询通道，DTO数据对象等众多要素。

因此大家对于它的理解与争议较多，我个人不是非常喜欢与人争论，将自己对DDD的理解，结合自己十多年在后台，移动端（iOS,Android)，基于Electron的桌面开发以及前端（TypeScript + React）的技术经验的基础上，取之名为myddd，表意为：ddd，我理解，我实现。不与人陷入争议之中。


## 官网

【myddd官网】: https://myddd.org

【微言码道】官网：https://taoofcoding.tech