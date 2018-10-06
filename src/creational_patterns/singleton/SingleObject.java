package creational_patterns.singleton;


////懒汉式，线程不安全
//public class SingleObject {
//	//创建SingleObject的一个对象
//	private static SingleObject instance;
//	
//	//让构造函数为private,避免被实例化
//	private SingleObject() {}
//	
//	public static SingleObject getInstance() {
//		if (instance == null) {
//			instance = new SingleObject();
//		}
//		return instance;
//	}
//	
//	public void showMessage() {
//		System.out.println("hello!");
//	}
//}




////懒汉式，线程安全
//public class SingleObject{
//	private static SingleObject instance;
//	private SingleObject() {}
//	
//	public static SingleObject getInstance() {
//		if (instance == null) {
//			instance = new SingleObject();
//		}
//		return instance;
//	}
//	public void shoeMessage() {
//		System.out.println("hello!");
//	}
//}




//饿汉式
public class SingleObject{
	private static SingleObject instance = new SingleObject();
	private SingleObject() {}
	public static SingleObject getInstance() {
		return instance;
	}
	public void showMessage() {
		System.out.println("hello!");
	}
}




////双检锁
//public class SingleObject{
//	private volatile static SingleObject instance;
//	private SingleObject() {}
//	public static SingleObject getInstance() {
//		if (instance == null) {
//			synchronized (SingleObject.class) {
//				instance = new SingleObject();				
//			}		
//		}
//		return instance;
//	}
//	public void showMessage() {
//		System.out.println("hello!");
//	}
//}




////登记式（静态内部类）
//public class SingleObject{
//	private static class SingleObjectHolder{
//		private static final SingleObject instance = new SingleObject();
//	}
//	private SingleObject() {}
//	public static final SingleObject getInstance() {
//		return SingleObjectHolder.instance;
//	}
//	public void showMessage() {
//		System.out.println("hello!");
//	}
//}




////枚举
//public enum SingleObject{
//	INSTANCE;
//	public void ShowMessage() {
//		System.out.println("hello!");
//	}
//}









