package description_practice;

import java.util.ArrayList;
import java.util.List;

public class Animal_ArreyList01_2 {
	 public static void main(String[] args) {
	        List<Animal_ArreyList01_1> listAnimal = new ArrayList<Animal_ArreyList01_1>();

	        Animal_ArreyList01_1 pig=new Animal_ArreyList01_1();
	        pig.setNameSing("こぶた", "ブーブー");

	        listAnimal.add(pig);


	        System.out.println(listAnimal.get(0).getName());
	        System.out.println(listAnimal.get(0).getSing());



	        System.out.println();
	        listAnimal.clear();
	        for(int i=0; i<4; i++){
	        	Animal_ArreyList01_1 animal=new Animal_ArreyList01_1();

	            if(i==0){
	                animal.setNameSing("こぶた", "ブーブー");
	            }else if(i==1){
	                animal.setNameSing("たぬき", "ぽんぽん");
	            }else if(i==2){
	                animal.setNameSing("きつね", "こんこん");
	            }else{
	                animal.setNameSing("ねこ", "にゃーお");
	            }
	            listAnimal.add(animal);
	            System.out.println(listAnimal.get(i).getName());
	            System.out.println(listAnimal.get(i).getSing());
	        }

	        System.out.println();

	        for (Animal_ArreyList01_1 animal : listAnimal) {
	            System.out.println(animal.getName());
	            System.out.println(animal.getSing());
	        }
	    }

	}

