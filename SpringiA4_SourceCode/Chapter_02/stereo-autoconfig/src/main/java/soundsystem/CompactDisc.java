package soundsystem;
/*
CompactDisc的具体内容并不重要，重要的是我将其定义为一个接口，作为接口，她定义了一个CD播放器对一盘
CD所能进行的操作。它将CD播放器的任意实现与CD本身的耦合降低到了最小的程度。
 */
public interface CompactDisc {
  void play();
}
