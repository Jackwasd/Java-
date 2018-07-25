package com.jack;

/**
 * 两个类相等的条件是两个类必须是同一个类加载器加载的
 */
public class ClassLoaderTest {
//    public static void main(String[] args) {
//        ClassLoader classLoader = new ClassLoader() {
//            @Override
//            public Class<?> loadClass(String name) throws ClassNotFoundException {
//                name = "java.lang.Object";
//                return super.loadClass(name);
//            }
//        };
//        try {
//            Object o = classLoader.loadClass("com.jack.ClassLoaderTest");
//            System.out.println(o instanceof com.jack.ClassLoaderTest);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) {
        ClassLoader classLoader = new ClassLoader() {
            @Override
            protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
                return super.loadClass(name, resolve);
            }

            @Override
            protected Class<?> findClass(String name) throws ClassNotFoundException {

                return super.findClass(name);
            }
        };
    }

}
