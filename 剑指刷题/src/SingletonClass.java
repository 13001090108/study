/*
饿汉式单例类
 */
public class SingletonClass {
    private static final SingletonClass instance = new SingletonClass();
    //私有构造函数
    private SingletonClass(){}
    public static SingletonClass getInstance() {
        return instance;
    }
}

