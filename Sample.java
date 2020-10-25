package model;

//Pravimo clasu koja predstavlja reč
//u nekom softweru za predikciju reči

public class Prediction {
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
}
