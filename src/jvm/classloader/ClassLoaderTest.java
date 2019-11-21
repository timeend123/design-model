package jvm.classloader;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author liuyuan
 * @create 2019-11-19 20:59
 * @description 类加载与instanceof关键字演示，可以看到虚拟机中存在了两个classLoaderTest类，
 * 一个由系统应用程序类加载器加载的，另外一个是由我们自定义的类加载器加载的，虽然都来自同一个Class文件，
 * 但依然是两个独立的类，做对象所属类型检查时结果自然为false
 **/
public class ClassLoaderTest {
    public static void main(String[] args) throws Exception{
        ClassLoader loader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null) {
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name,b,0,b.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };
        Object object=loader.loadClass("jvm.classloader.ClassLoaderTest").newInstance();
        System.out.println(object.getClass());
        System.out.println(object instanceof ClassLoaderTest);
    }
}
