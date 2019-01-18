package spittr.web;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/*断言assertEquals("home",controller.home())方式只是测试了home()方法中会发生什么。在测试中会直接
调用home()方法，并断言返回包含“home"值得String。他完全没有站在SpringMVC控制器的视角进行测试。这个测试没有
断言当接受到针对“/"的GET请求时会调用home()方法。因为他返回的值就是”home“，所以也没有真正的判断home视图的名称。

   不过从Spring3.2开始，我们可以按照控制器的方式来测试Spring MVC中的控制器了，而不仅仅是作为POJO进行测试。Spring
 现在包含一种mock Spring MVC并针对控制器执行HTTP请求的机制。这样的话，在测试控制器的时候，就没有必要再启动Web服务器
 和Web浏览器了。

   尽管新版本的测试只是比之前版本多了几行代码，但是他更加完整的测试了HomeController。这次我们不是这届调用home()方法
 并测试他的返回值，而是发起了对"/"的GET请求。并断言结果视图的名称为home。他首先传递一个HomeController实例到
 MockMvcBuilders.standaloneSetup()并调用build()来构建MockMvc实例。然后它使用MockMvc实例来执行针对“/"的GET
 请求并设置期望得到的视图名称。
 */

public class HomeControllerTest {

  @Test
  public void testHomePage() throws Exception {
    HomeController controller = new HomeController();
    MockMvc mockMvc = standaloneSetup(controller).build();
    mockMvc.perform(get("/"))
           .andExpect(view().name("home"));
  }

}
