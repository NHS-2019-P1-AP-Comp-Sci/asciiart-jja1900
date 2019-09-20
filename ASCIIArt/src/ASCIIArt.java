/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main (String [] args) {
		System.out.println("THIS IS MY ASCII ART!!!!");
		System.out.println("THIS IS MY ASCII ART!!!!");
		System.out.println("THIS IS MY ASCII ART!!!!");
		System.out.println("THIS IS MY ASCII ART!!!!");
		System.out.println("THIS IS MY ASCII ART!!!!");
		ears();
		face();
		tailandfeet();
		grass();
		description();
	}
	public static void ears() {
		System.out.println("(\\)(/)");
	}
	public static void face() {
		System.out.println("( . .)");
	}
	public static void tailandfeet() {
		System.out.println("c(')(')");
	} 
	public static void grass() {
		System.out.println("^^^^^^^^^");
	}
	public static void description() {
		System.out.println("A rabbit sitting on grass.");
	}
}