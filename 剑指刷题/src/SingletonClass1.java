/**
 * Created by lsc on 2018/11/15.
 * 懒汉式单例模式
 */

public class SingletonClass1 {
    private static SingletonClass1 instance = null;
    //私有构造函数
    private SingletonClass1(){}
    public synchronized static SingletonClass1 getInstance() {
        if(instance == null) {
            instance = new SingletonClass1();
        }
        return instance;
    }
}

