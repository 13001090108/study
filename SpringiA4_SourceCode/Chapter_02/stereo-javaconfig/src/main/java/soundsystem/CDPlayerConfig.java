package soundsystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
@Configuration注解表明这个类是一个配置类。该类应该包含在Spring应用上下文中如何创建bean的细节
@Bea000000n注解会告诉Spring这个方法将会返回一个对象，该对象要注册为Spring应用上下文中的bean。方法体中包含
了最终产生bean实例的逻辑
 */

@Configuration
public class CDPlayerConfig {

  @Bean
  public CompactDisc compactDisc() {return new SgtPeppers();}

  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {return new CDPlayer(compactDisc);}
}
