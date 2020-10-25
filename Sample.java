package model;

//Pravimo clasu koja predstavlja reč
//u nekom softweru za predikciju reči

public class Prediction {
	private String word;
	private double probability;	
	
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
