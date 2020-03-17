package polymorphism;

import java.util.ArrayList;

class Animal {
	
	public void move() {
		
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void make() {
		System.out.println("사람이 물건을 만듭니다.");
	}
	
	
}

class Tiger extends Animal {
	
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
	    System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void flying() {
	    System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		
		Animal aAnimal = new Animal();
		Animal hAnimal = new Human(); 
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		//다운 캐스팅 예제
//		Human human = (Human)hAnimal; //다운캐스팅을 통해 human에만 정의된 메서드 사용 가능.
//		human.make();
//		
////		Eagle eagle = (Eagle)hAnimal; //hAnimal의 인스턴스값은 human이기 때문에 컴파일시에 에러 발생.
//		if ( hAnimal instanceof Eagle) { //hAimal의 instance를 확인해서 Eagle이면 true.
//		    Eagle eagle = (Eagle)hAnimal;
//		}
//		
//	      if ( hAnimal instanceof Human) { 
//	            Human man = (Human)hAnimal;
//	            man.make();
//	        }
//		
		
//		AnimalTest test = new AnimalTest(); 
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
//		
		 ArrayList<Animal> animalList = new ArrayList<Animal>();
		 animalList.add(hAnimal);
		 animalList.add(tAnimal);
		 animalList.add(eAnimal);
		 
		 AnimalTest test = new AnimalTest(); 
		 test.testDownCasting(animalList);
		 
//		 for(Animal animal : animalList) {
//		     animal.move();
//		 }
		

	}
	
	public void testDownCasting(ArrayList<Animal> list) {
	    for(int i = 0; i < list.size(); i++) {
	        Animal animal = list.get(i);
	        
	        if (animal instanceof Human) {
	            Human human = (Human)animal;
	            human.make();
	        }
	        else if (animal instanceof Tiger) {
	            Tiger tiger = (Tiger)animal;
	            tiger.hunting();
	        }
            else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle)animal;
                eagle.flying();
            }	        
            else {
                System.out.println("error");
            }
	        
	    }
	 
	}
	
	
	public void moveAnimal (Animal animal){ 
		animal.move();
	}

}
