// Реализация интерфейса Series
class Prob implements Proba {
        //Объявляем переменные
        String name;
        int date;
        
        //Объявляем конструктор объекта класса By2
        Prob() {
                name = "Empty_name";
                date = 1000;
        }
        //Реализация метода интерфейса getNext - получения следующегозначения в последовательности 

        public String getName(){
                return name;
        }
	public int getDate(){
		return date;
	}
        //Реализация метода интерфейса reset() - сброс значения на начало последовательности
        public void reset() {
        name ="No_name";
        date = 999;
        }

        public void setStatus(int x,String s){
        date = x;
	name = s;
	}
}
class Prob1 {
        public static void main(String[] args) throws java.io.IOException {
                Prob p = new Prob();
                System.out.println("Первый вывод ");
                
                System.out.println(p.getName());
		System.out.println(p.getDate());

		System.out.println("Вторая попытка вывести свои имена ");
		
		p.setStatus(2000,"Andrey");
		System.out.println(p.getName());
                System.out.println(p.getDate());
		
	}}

