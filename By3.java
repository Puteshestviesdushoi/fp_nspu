// Реализация интерфейса Series
class By3 implements Series {
	//Объявляем переменные
	int start;
	int val;
	//Объявляем конструктор объекта класса By2
	By3() {
		start = 0;
		val = 0;
	}

	//Реализация метода интерфейса getNext - получения следующегозначения в последовательности 
	
	public int getNext(){
		val += 3;
		return val;
	}
	//Реализация метода интерфейса reset() - сброс значения на начало последовательности
	public void reset() {
	val = start;
	}

	// Реализация метода интерфейса SetStart установка нового начала последовательности
	public void setStart(int x){
	start = x;
	val = x;
	}
}


