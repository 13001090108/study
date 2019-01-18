package soundsystem;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
类CDPlayerConfig通过Java代码定义了Spring的装配规则，@ComponentScan注解能够在Spring中启用组件扫描
如果没有其他配置的话，@ComponentScan默认会扫描与配置类相同的包。因为CDPlayerConfig类位于soundsystem包中，
因为Spring将会扫描这个包以及这个包下的所有子包，查找带有@Componet注解的类，这样的话就能发现CompactDisc，并且
会在Spring中自动为其创建一个bean
 */

@Configuration
@ComponentScan(basePackageClasses = {CDPlayer.class })
public class CDPlayerConfig {

}

