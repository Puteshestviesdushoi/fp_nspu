// Реализация интерфейса Series
class By2 implements Series {
	//Объявляем переменные
	int start;
	int val;
	int prev;
	//Объявляем конструктор объекта класса By2
	By2() {
		prev = -2;
		start = 0;
		val = 0;
	}

	//Реализация метода интерфейса getNext - получения следующегозначения в последовательности 
	
	public int getNext(){
		prev = val;
		val += 2;
		return val;
	}
	//Реализация метода интерфейса reset() - сброс значения на начало последовательности
	public void reset() {
	val = start;
	prev = start -2;
	}

	// Реализация метода интерфейса SetStart установка нового начала последовательности
	public void setStart(int x){
	start = x;
	val = x;
	prev = start - 2;
	}

	// Добавляем новый метод непосредственно внутрь класса By2
	int getPrevious(){
		return prev;
	}
}

class SeriesDemo {
	public static void main(String[] args) {
		By2 by2 = new By2();
		By3 by3 = new By3();
		Series s;
		s = by2;
		System.out.println("Последовательность \" через 2 \": ");
		for (int i = 0;i<5;i++){
			System.out.print(s.getNext() + " ");
			}
		System.out.println();
		System.out.println("вывод предыдущих через 2");
		System.out.println();
		for (int i = 0;i<5;i++){
			by2.getNext();
                        System.out.print(by2.getPrevious() + " ");
                        }


		//Сброс последовательности к нулю
		s.reset();
		
		System.out.println("Последовательность \" через 2 \": после сброса в 0");
                for (int i = 0;i<5;i++)
		{
                        System.out.print(s.getNext() + " ");
			
		}
                System.out.println();
		
		//Новое стартовое значение 51
		s.setStart(51);
	        System.out.println("Последовательность \" через 2 \": после установки стартового значения в 51 ");
                for (int i = 0;i<5;i++)
		{
                        System.out.print(s.getNext() + " ");
		}
		System.out.println();

		s = by3;
                System.out.println("Последовательность \" через 2 \": ");
                for (int i = 0;i<5;i++){
                        System.out.print(s.getNext() + " ");
                        }
                System.out.println();
                System.out.println("вывод предыдущих через 2");
                System.out.println();

                //Сброс последовательности к нулю
                s.reset();

                System.out.println("Последовательность \" через 2 \": после сброса в 0");
                for (int i = 0;i<5;i++)
                {
                        System.out.print(s.getNext() + " ");

                }
                System.out.println();

                //Новое стартовое значение 51
                s.setStart(51);
		System.out.println("Последовательность \" через 2 \": после установки стартового значения в 51 ");
                for (int i = 0;i<5;i++)
                {
                        System.out.print(s.getNext() + " ");
                }
                System.out.println();
	}

}
