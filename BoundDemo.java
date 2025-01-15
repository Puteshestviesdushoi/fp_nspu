class NumericFns <T extends Number>{
	T num;

	//Конструктор
	NumericFns(T n){
		num = n;
	}

	//Метод, возвращающий обратное значение числа 
	double reciprocal(){
		return 1/num.doubleValue();
	}

	//Метод, возвращающий дробную часть 
	double fraction(){
		return num.doubleValue() -num.intValue();
	
	}

	//Методд, сравнивающий абсолютные значение двух чисел
	boolean absEqual(NumericFns<?> ob){
		if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}

	/*Пример ограничение для типов при использовании подстановочного знака
	void test(NumericFns <? extends Number>){
		...
	}

	*/
}
class BoundDemo {
	public static void main(String[] args) {
		NumericFns <Integer> iOb = new NumericFns <> (5);
		System.out.println("Обратная величина iOb: " + iOb.reciprocal());
		System.out.println("Дробная величина iOb: " + iOb.fraction());
		System.out.println();

		NumericFns <Double> dOb = new NumericFns <> (5.51);
                System.out.println("Обратная величина dOb: " + dOb.reciprocal());
                System.out.println("Дробная величина dOb: " + dOb.fraction());
                System.out.println();
		
		NumericFns <Double> dOb2 = new NumericFns <> (-5.0);	
		//Ограничение на числовой тип данных "T exends Number" проверятеся компилятором
		//NumericFns <String> sOb;
		
		System.out.println("Aбсолютные зачения равны " + iOb.absEqual(dOb2));
		

	}

}
