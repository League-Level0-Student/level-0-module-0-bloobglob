package _07_last_summer;

import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
String sentence;	
	if(name.equalsIgnoreCase("Lucas")) {
		sentence = "I know that you played videogames last summer, " + name + ". MUAHAHAHAHAHAHA!";	
	}else {
sentence = "I know that you slept last summer, " + name + ". MUAHAHAHAHAHAHA!";
}JOptionPane.showMessageDialog(null, sentence);
}}
