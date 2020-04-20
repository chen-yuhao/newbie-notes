# struts2

由于公司项目有用到，所以先以该框架练手来整理知识点

struts 工作流程
1、客户端浏览器发出HTTP请求
2、根据web.xml 配置,请求被FilterDispatcher 接收
3、根据struts.xml配置，找到需要调用的Action类和`方法`，并通过IoC方式，将值注入到Action
4、Action调用业务逻辑组件处理业务逻辑，这一步包含表达验证
5、Action执行完毕，根据struts.xml中配置找到对应返回结果result,并跳到相应页面
6、返回HTTP响应到客户端浏览器

工作原理
在Struts2框架中的处理大概分为以下几个步骤 
1、客户端初始化一个指向Servlet容器（例如Tomcat）的请求 
2、这个请求经过一系列的过滤器（Filter）（这些过滤器中有一个叫做ActionContextCleanUp的可选过滤器，这个过滤器对于Struts2和其他框架的集成很有帮助，例如：SiteMesh Plugin） 
3、接着FilterDispatcher被调用，FilterDispatcher询问ActionMapper来决定这个请是否需要调用某个Action 
4、如果ActionMapper决定需要调用某个Action，FilterDispatcher把请求的处理交给ActionProxy 
5、ActionProxy通过Configuration Manager询问框架的配置文件，找到需要调用的Action类 
6、ActionProxy创建一个ActionInvocation的实例。 
7、ActionInvocation实例使用命名模式来调用，在调用Action的过程前后，涉及到相关拦截器（Intercepter）的调用。 
8、一旦Action执行完毕，ActionInvocation负责根据struts.xml中的配置找到对应的返回结果。返回结果通常是（但不总是，也可 能是另外的一个Action链）一个需要被表示的JSP或者FreeMarker的模版。在表示的过程中可以使用Struts2 框架中继承的标签。在这个过程中需要涉及到ActionMapper 

- [https://struts.apache.org/](https://struts.apache.org/)
- [https://www.cnblogs.com/2318m/articles/6586541.html](https://www.cnblogs.com/2318m/articles/6586541.html)
- [https://www.w3cschool.cn/struts_2/](https://www.w3cschool.cn/struts_2/)
- [https://blog.csdn.net/u013087513/article/details/60578692](https://blog.csdn.net/u013087513/article/details/60578692)
- [https://juejin.im/post/5aa3349ff265da23884caa6a](https://juejin.im/post/5aa3349ff265da23884caa6a)
