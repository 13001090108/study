package soundsystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
构造器上添加了@Autowired注解，这表明当Spring创建CDPlayer bean的时候，会通过这个构造器来进行实例化
并且会传入一个可设置给CompactDisc类型的bean，注意：@Autowired注解不仅能够用在构造器上，还能用在属性
Setter方法上，比方说，日哦过CDPlayer有一个setCompactDisc()方法，那么可以同样可以采用@Autowired注解
 */


@Component
public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  @Autowired
  public CDPlayer(CompactDisc cd) {this.cd = cd;}

  public void play() {cd.play();}
}

