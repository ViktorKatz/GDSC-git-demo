package model;

//Pravimo clasu koja predstavlja reč
//u nekom softweru za predikciju reči

public class Prediction { //Ovo je super klasa
	private String word;
	private double probability;	
	
	public Prediction(String w, double p){
		word = w;
		probability = p;
	}
	
	public String getWord(){
		return word;
	}
	
	public void setWord(String w){
		word = w;
	}
	
	public String toString(){
		return word + "(" + probability + ")";
	}
}
