package me.atticuszambrana.tod;

import me.atticuszambrana.tod.common.Question;
import me.atticuszambrana.tod.common.Question.QuestionType;
import me.atticuszambrana.tod.data.AtticusInput;

public class Starter {
	public static void main(String[] args) {
		AtticusInput input = new AtticusInput();
		QuestionManager.generateList();
		
		System.out.println("Welcome to Atticus' Truth or Dare, Truth Card Machine!\n\n");
		System.out.println("Simply put in a question type, and I will give you a truth card to ask!");
		
		game(input);
	}
	
	private static void game(AtticusInput input) {
		
		System.out.println("You need to pick a question type. The ones to choose from are: General, Embarressing, Funny, Friendship, Flirty, Dirty, Any");
		System.out.println("Please type which one you would like...");
		
		QuestionType type = null;
		try {
			type = QuestionType.valueOf(input.get().toUpperCase());
		} catch(Exception ex) {
			System.out.println("Thats not one of the question types. Did you spell it correctly?");
			System.out.println("Exiting game cause you cant spell..");
			System.exit(0);
		}
		
		for(int i = 0; i < 100; i++) {
			System.out.println("\n\n");
		}
		
		System.out.println("Searching through the deck...\n");
		
		Question q = QuestionManager.getQuestion(type);
		
		System.out.println("=================================================");
		System.out.println("I picked from the: " + q.getType().toString().toUpperCase() + " deck");
		System.out.println(q.getData());
		System.out.println("=================================================");
		
		System.out.println("\n");
		
		game(input);
	}

}
