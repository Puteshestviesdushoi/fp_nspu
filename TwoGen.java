class TwoGen <T,V> {
	T ob1;
	V ob2;

	TwoGen(T o1, V o2){
		ob1 = o1;
		ob2 = o2;
	}

	void showTypes(){
		System.out.println("Тип Т :" + ob1.getClass().getName());
		System.out.println("Тип V :" + ob2.getClass().getName());
	}

	T getOb1(){
		return ob1;
	}

	V getOb2(){
		return ob2;
	}
}

class TwoGenDemo {
	public static void main(String[] args){
		TwoGen <Integer,String> isObj = new TwoGen <> (102,"Строковый пааметр V");

		isObj.showTypes();
		int v = isObj.getOb1();
		System.out.println("Значение первого типа " + v);
		String str = isObj.getOb2();
		System.out.println("Значение второго  типа " + str);

}
}
