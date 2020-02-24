package me.atticuszambrana.tod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import me.atticuszambrana.tod.common.Question;
import me.atticuszambrana.tod.common.Question.QuestionType;

public class QuestionManager {
	public static List<Question> questions = new ArrayList<>();
	
	public static void generateList() {
		questions.add(new Question("Have you ever sexted anyone?", QuestionType.DIRTY));
		questions.add(new Question("Who here, has seen you without clothes on?", QuestionType.DIRTY));
		questions.add(new Question("Have you ever seen a naughty magazine?", QuestionType.DIRTY));
		questions.add(new Question("Have you ever considered sending a nude selfie? Who would you send it to?", QuestionType.DIRTY));
		questions.add(new Question("Have you ever searched for anything dirty on the internet?", QuestionType.DIRTY));
		questions.add(new Question("Who do you want to sleep with, out of everyone here. (You have to pick someone)", QuestionType.DIRTY));
		questions.add(new Question("How many people have you kissed?", QuestionType.DIRTY));
		questions.add(new Question("How many people have you slept with?", QuestionType.DIRTY));
		questions.add(new Question("Have you ever been attracted to the same sex?", QuestionType.DIRTY));
		questions.add(new Question("When and where was your first kiss? Who was it with?", QuestionType.DIRTY));
		questions.add(new Question("When did you loose your virginity? and whom did you loose it to?", QuestionType.DIRTY));
		questions.add(new Question("What is your ultimate sexual fantasy?", QuestionType.DIRTY));
		questions.add(new Question("Do you sleep nude?", QuestionType.DIRTY));
		questions.add(new Question("If you had to go skinny dipping with someone in this room, who would it be?", QuestionType.DIRTY));
		questions.add(new Question("If you could plan a class prank knowing you will never get caught, what would the prank be?", QuestionType.GENERAL));
		questions.add(new Question("Have you ever had a crush on a teacher?", QuestionType.GENERAL));
		questions.add(new Question("Who would you take out to prom, who is in this room?", QuestionType.GENERAL));
		questions.add(new Question("Have you ever made out with someone at school? If so, who?", QuestionType.GENERAL));
		questions.add(new Question("What is the most embarrasing thing you have done in front of a teacher?", QuestionType.GENERAL));
		questions.add(new Question("Which is better, tests or essays?", QuestionType.GENERAL));
		questions.add(new Question("Have you ever eaten lunch by yourself? Why?", QuestionType.GENERAL));
		questions.add(new Question("If you wanted to make out with someone on campus, where would you do it?", QuestionType.GENERAL));
		questions.add(new Question("What is the worst score you have gotten on a test?", QuestionType.GENERAL));
		questions.add(new Question("Have you ever fallen asleep in class?", QuestionType.GENERAL));
		questions.add(new Question("Have you ever been suspended from school?", QuestionType.GENERAL));
		questions.add(new Question("Who is the hottest teacher at our school?", QuestionType.GENERAL));
		questions.add(new Question("If you had to take someone from another grade to prom, who would it be?", QuestionType.GENERAL));
		questions.add(new Question("Who do you want to make out with, the most, currently in this room?", QuestionType.FLIRTY));
		questions.add(new Question("If you had to flash one person in this room, who would it be?", QuestionType.FLIRTY));
		questions.add(new Question("If you haven't had your first kiss yet, who in this room would you want to have your first kiss with?", QuestionType.FLIRTY));
		questions.add(new Question("Of all the people in this room, who would you want to go out with the most?", QuestionType.FLIRTY));
		questions.add(new Question("Describe the most attractive thing about each person in this room", QuestionType.FLIRTY));
		questions.add(new Question("Who here do you think is the best flirt?", QuestionType.FLIRTY));
		questions.add(new Question("Who here has the best smile?", QuestionType.FLIRTY));
		questions.add(new Question("Who here has the cutest nose?", QuestionType.FLIRTY));
		questions.add(new Question("Who here has the prettiest eyes?", QuestionType.FLIRTY));
		questions.add(new Question("Who is the funniest in this room?", QuestionType.FLIRTY));
		questions.add(new Question("What is one thing you would never do in front of someone you have a crush on?", QuestionType.FLIRTY));
		questions.add(new Question("What is your wildest fantasy?", QuestionType.FLIRTY));
		questions.add(new Question("How far would you go with someone that you just met, that you will never see again?", QuestionType.FLIRTY));
		questions.add(new Question("Rate me on a scale of 1 to 10, with 10 being the hottest", QuestionType.FLIRTY));
		questions.add(new Question("If you had one week to live, and had to marry someone in this room, who would it be?", QuestionType.FLIRTY));
		questions.add(new Question("What is your biggest turn on?", QuestionType.FLIRTY));
		questions.add(new Question("What is your biggest turn off?", QuestionType.FLIRTY));
		questions.add(new Question("Would you go out with me if I was the last person on earth?", QuestionType.FLIRTY));
		questions.add(new Question("What's the most flirtatious thing you've ever done?", QuestionType.FLIRTY));
		questions.add(new Question("If you could go on a romantic date with anyone in this room, who would you pick?", QuestionType.FLIRTY));
		questions.add(new Question("your crush told you he liked your best friend, what would you do?", QuestionType.FRIENDSHIP));
		questions.add(new Question("What if your best friend told you that she liked your crush?", QuestionType.FRIENDSHIP));
		questions.add(new Question("you knew your friend's boyfriend was cheating on her, what would you do?", QuestionType.FRIENDSHIP));
		questions.add(new Question("Have you ever told a lie about your best friend to make yourself look better?", QuestionType.FRIENDSHIP));
		questions.add(new Question("If you had to date someone else's boyfriend, who would it be?", QuestionType.FRIENDSHIP));
		questions.add(new Question("Have you ever shared your friend's secret with someone else?", QuestionType.FRIENDSHIP));
		questions.add(new Question("Rate everyone in the room from 1 to 10, with 10 being the hottest.", QuestionType.FRIENDSHIP));
		questions.add(new Question("Would you share a toothbrush with your best friend?", QuestionType.FRIENDSHIP));
		questions.add(new Question("Have you ever ignored a friend's text? Why did you do it?", QuestionType.FRIENDSHIP));
		questions.add(new Question("Have you ever lied to your best friend?", QuestionType.FRIENDSHIP));
		questions.add(new Question("If your friend asked you to lie for her and you knew you would get in trouble, would you do it?", QuestionType.FRIENDSHIP));
		questions.add(new Question("If one of your friends were cheating with your other friend's boyfriend, what would you do?", QuestionType.FRIENDSHIP));
		questions.add(new Question("Would you ditch your friends if you could become the most popular girl in school?", QuestionType.FRIENDSHIP));
		questions.add(new Question("If you had to choose, who would you stop being friends with?", QuestionType.FRIENDSHIP));
		questions.add(new Question("Name one thing you would change about each person in this room.", QuestionType.FRIENDSHIP));
		questions.add(new Question("If you had to trade your friend in for the celebrity crush of your dreams, which friend would you choose?", QuestionType.FRIENDSHIP));
		questions.add(new Question("What was your first impression of your best friend's boyfriend?", QuestionType.FRIENDSHIP));
		questions.add(new Question("Have you ever thought about ditching your friend for a boy?", QuestionType.FRIENDSHIP));
		questions.add(new Question("If someone asked you what your best friend is like, how would you describe her?", QuestionType.FRIENDSHIP));
		questions.add(new Question("You win a trip and are allowed to bring two people. Who do you pick?", QuestionType.FRIENDSHIP));
		questions.add(new Question("Who would you hate to see naked?", QuestionType.FUNNY));
		questions.add(new Question("How long have you gone, without a shower?", QuestionType.FUNNY));
		questions.add(new Question("If you could only text one person for the rest of your life, but you could never talk to that person face to face, who would that be?", QuestionType.FUNNY));
		questions.add(new Question("How long have you gone without brushing your teeth?", QuestionType.FUNNY));
		questions.add(new Question("What's one thing you would never eat on a first date?", QuestionType.FUNNY));
		questions.add(new Question("What have you seen that you wish you could unsee?", QuestionType.FUNNY));
		questions.add(new Question("If you could be reincarnated into anyone's body, who would you want to become?", QuestionType.FUNNY));
		questions.add(new Question("If you switched genders for the day, what would you do?", QuestionType.FUNNY));
		questions.add(new Question("What's one food that you will never order at a restaurant?", QuestionType.FUNNY));
		questions.add(new Question("What's the worst weather to be stuck outside in if all you could wear was a bathing suit?", QuestionType.FUNNY));
		questions.add(new Question("If your car broke down in the middle of the road, who in this room would be the last person you would call? Why?", QuestionType.FUNNY));
		questions.add(new Question("What's the most useless piece of knowledge you know?", QuestionType.FUNNY));
		questions.add(new Question("What did you learn in school that you wish you could forget?", QuestionType.FUNNY));
		questions.add(new Question("Is it better to use shampoo as soap or soap as shampoo?", QuestionType.FUNNY));
		questions.add(new Question("If you ran out of toilet paper, would you consider wiping with the empty roll?", QuestionType.FUNNY));
		questions.add(new Question("What would be the worst part about getting pantsed in front of your crush?", QuestionType.FUNNY));
		questions.add(new Question("If you could only use one swear word for the rest of your life, which one would you choose?", QuestionType.FUNNY));
		questions.add(new Question("What's the best thing to say to your friend that would be the worst thing to say to your crush?", QuestionType.FUNNY));
		questions.add(new Question("Would you rather eat dog food or cat food?", QuestionType.FUNNY));
		questions.add(new Question("If you had nine lives, what would you do that you wouldn't do now?", QuestionType.FUNNY));
		questions.add(new Question("If you could play a prank on anyone without getting caught, who would you play it on?", QuestionType.FUNNY));
		questions.add(new Question("If you could choose to never sweat for the rest of your life or never have to use the bathroom, which would you choose?", QuestionType.FUNNY));
		questions.add(new Question("If you could spend every waking moment with your gf or bf, would you?", QuestionType.FUNNY));
		questions.add(new Question("What was the last thing you searched for on your phone? Show us", QuestionType.EMBARRASSING));
		questions.add(new Question("If you had to choose between going naked or having your thoughts appear in thought bubbles above your head for everyone to read, which would you choose?", QuestionType.EMBARRASSING));
		questions.add(new Question("Have you ever walked in on your parents doing it?", QuestionType.EMBARRASSING));
		questions.add(new Question("After you've dropped a piece of food, what's the longest time you've left it on the ground and then ate it?", QuestionType.EMBARRASSING));
		questions.add(new Question("Have you ever tasted a booger?", QuestionType.EMBARRASSING));
		questions.add(new Question("Have you ever played Cards Against Humanity with your parents?", QuestionType.EMBARRASSING));
		questions.add(new Question("What's the first thing you would do if you woke up one day as the opposite sex?", QuestionType.EMBARRASSING));
		questions.add(new Question("Have you ever peed in the pool?", QuestionType.EMBARRASSING));
		questions.add(new Question("Who do you think is the worst dressed person in this room?", QuestionType.EMBARRASSING));
		questions.add(new Question("Have you ever farted in an elevator?", QuestionType.EMBARRASSING));
		questions.add(new Question("True or false? You have a crush on [fill in the blank].", QuestionType.EMBARRASSING));
		questions.add(new Question("Of the people in this room, who do you want to trade lives with?", QuestionType.EMBARRASSING));
		questions.add(new Question("What are some things you think about when sitting on the toilet?", QuestionType.EMBARRASSING));
		questions.add(new Question("Did you have an imaginary friend growing up?", QuestionType.EMBARRASSING));
		questions.add(new Question("Do you cover your eyes during a scary part in a movie?", QuestionType.EMBARRASSING));
		questions.add(new Question("Have you ever practiced kissing in a mirror?", QuestionType.EMBARRASSING));
		questions.add(new Question("Did your parents ever give you the “birds and the bees” talk?", QuestionType.EMBARRASSING));
		questions.add(new Question("What is your guilty pleasure?", QuestionType.EMBARRASSING));
		questions.add(new Question("What is your worst habit?", QuestionType.EMBARRASSING));
		questions.add(new Question("Have you ever walked into a wall?", QuestionType.EMBARRASSING));
		questions.add(new Question("Do you pick your nose?", QuestionType.EMBARRASSING));
		questions.add(new Question("Do you sing in the shower?", QuestionType.EMBARRASSING));
		questions.add(new Question("Have you ever peed yourself?", QuestionType.EMBARRASSING));
		questions.add(new Question("What was your most embarrassing moment in public?", QuestionType.EMBARRASSING));
		questions.add(new Question("Have you ever farted loudly in class?", QuestionType.EMBARRASSING));
		questions.add(new Question("Do you ever talk to yourself in the mirror?", QuestionType.EMBARRASSING));
		questions.add(new Question("What would be in your web history that you’d be embarrassed if someone saw?", QuestionType.EMBARRASSING));
		questions.add(new Question("Do you drool in your sleep?", QuestionType.EMBARRASSING));
		questions.add(new Question("Do you talk in your sleep?", QuestionType.EMBARRASSING));
		questions.add(new Question("Who is your secret crush?", QuestionType.EMBARRASSING));
		questions.add(new Question("Do you think [fill in the name] is cute?", QuestionType.EMBARRASSING));
		questions.add(new Question("Who do you like the least in this room, and why?", QuestionType.EMBARRASSING));
		questions.add(new Question("What does your dream boy or girl look like?", QuestionType.EMBARRASSING));
		questions.add(new Question("Who is the sexiest person in this room?", QuestionType.EMBARRASSING));
		questions.add(new Question("How would you rate your looks on a scale of 1 to 10?", QuestionType.EMBARRASSING));
		questions.add(new Question("Would you rather have sex with [insert name] in secret or not have sex with that person, but everyone thinks you did?", QuestionType.EMBARRASSING));
		questions.add(new Question("What color underwear are you wearing right now?", QuestionType.EMBARRASSING));
		questions.add(new Question("What was the last thing you texted?", QuestionType.EMBARRASSING));
		questions.add(new Question("If you were rescuing people from a burning building and you had to leave one person behind from this room, who would it be?", QuestionType.EMBARRASSING));
		questions.add(new Question("Do you think you'll marry your current girlfriend/boyfriend?", QuestionType.EMBARRASSING));
		questions.add(new Question("Would you rather lose your sex organs forever or gain 200 pounds?", QuestionType.EMBARRASSING));
		questions.add(new Question("Who in this room would be the worst person to date? Why?", QuestionType.EMBARRASSING));
		questions.add(new Question("If someone offered you $1 million to break up with your girlfriend/boyfriend, would you do it?", QuestionType.EMBARRASSING));
		questions.add(new Question("Has your boyfriend or girlfriend ever embarrassed you?", QuestionType.EMBARRASSING));
		questions.add(new Question("Have you ever thought about cheating on your partner?", QuestionType.EMBARRASSING));
		questions.add(new Question("Have you ever been caught checking someone out?", QuestionType.EMBARRASSING));
		questions.add(new Question("If you could suddenly become invisible, what would you do?", QuestionType.EMBARRASSING));
		questions.add(new Question("When was the last time you wet the bed?", QuestionType.EMBARRASSING));
		questions.add(new Question("Do you have any silly nicknames?", QuestionType.EMBARRASSING));
	}
	
	public static Question getQuestion(QuestionType type) { 
		Random r = new Random();
		int i = r.nextInt(questions.size());
		Question q = questions.get(i);
		if(type != QuestionType.ANY) {
			if(q.getType() == type) {
				return q;
			}
			else {
				return getQuestion(type);
			}
		} else {
			return q;
		}
	}
}
