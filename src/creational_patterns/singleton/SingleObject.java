package creational_patterns.singleton;


////����ʽ���̲߳���ȫ
//public class SingleObject {
//	//����SingleObject��һ������
//	private static SingleObject instance;
//	
//	//�ù��캯��Ϊprivate,���ⱻʵ����
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




////����ʽ���̰߳�ȫ
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




//����ʽ
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




////˫����
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




////�Ǽ�ʽ����̬�ڲ��ࣩ
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




////ö��
//public enum SingleObject{
//	INSTANCE;
//	public void ShowMessage() {
//		System.out.println("hello!");
//	}
//}









