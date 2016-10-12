import java.net.URL;
import java.util.Scanner;

public class MadLibRandom
{
	public static void main(String[] args)
	{
		String[] males = { "Rob", "Darius", "Cliff", "Dane", "Monty", "Reggie", "Gus",
			"Vernon", "Maynard", "Gavin", "Ward", "Stefan", "Winfred" };	

		String[] females = { "Laurene", "Kathy", "Yoko", "Matilda", "Georgette", "Greta",
			"Meg", "Ruby", "Rikki", "Suzanne", "Dorine", "Elaine", "Frederica" };	

		String[] nouns = { "moment", "joy", "license", "race", "inertia", "molecule",
			"helicopter", "sweat", "blame", "brush", "art", "song", "liberty" };

		// past-tense verbs
		String[] verbs_pt = { "ground", "settled", "gave", "labeled", "restored", "washed",
			"sold", "arranged", "neglected", "accused", "confined" };

		String[] adjectives = { "overdue", "collapsed", "jealous", "topical", "naughty", "third", 
			"sharp", "electrical", "bogus", "warm", "cryptic", "hopeful", "alleged" };

		String[] adverbs = { "endlessly", "wholly", "mentally", "brightly", "willingly",
			"sweetly", "legitimately", "behind", "instead", "within" };

		String[] colors = { "red", "orange", "yellow", "blue", "purple", "green",
			"white", "black", "pink", "brown", "grey", "hazel" };	

		String[] numbers = { "one", "two", "three", "four", "five", "six", "seven" };

		String[] bodyparts_s = { "nose", "mouth", "ear", "hand", "stomach", "back", "shoulder", "hair", "spleen" };

		String[] bodyparts_pl = { "teeth", "legs", "arms", "ears", "eyes", "hands" };	


		int mi   = 0 + (int)(Math.random()* males.length       ); // male
		int fi   = 0 + (int)(Math.random()* females.length     ); // female
		int ai1  = 0 + (int)(Math.random()* adjectives.length  ); // adjective 1
		int ai2  = 0 + (int)(Math.random()* adjectives.length  ); // adjectuve 2
		int vi1  = 0 + (int)(Math.random()* verbs_pt.length    ); // past-tense verb 1
		int ni1  = 0 + (int)(Math.random()* nouns.length       ); // singular noun 1
		int numi = 0 + (int)(Math.random()* numbers.length     ); // number
		int ci   = 0 + (int)(Math.random()* colors.length      ); // color
		int ni2  = 0 + (int)(Math.random()* nouns.length       ); // singular noun 2
		int bi   = 0 + (int)(Math.random()* bodyparts_pl.length); // body part (plural)
		int vi2  = 0 + (int)(Math.random()* verbs_pt.length    ); // past-tense verb 2
		int adv  = 0 + (int)(Math.random()* adverbs.length     );
		String male     = males[mi];
		String female   = females[fi];
		String adj1     = adjectives[ai1];
		String adj2     = adjectives[ai2];
		String verb1    = verbs_pt[vi1];
		String noun1    = nouns[ni1];
		String number   = numbers[numi];
		String color    = colors[ci];
		String noun2    = nouns[ni2];
		String bodypart = bodyparts_pl[bi];
		String verb2    = verbs_pt[vi2];
		String adverb1  = adverbs[adv];
		System.out.printf("One afternoon %s and %s were walking down a(n) %s trail,\n", male, female, adj1);
		System.out.printf("looking for kindling for their campfire. The trees were %s and\n", adj2 );
		System.out.printf("%s, and there were colorful wildflowers all around. %s and %s\n", color, male, female );
		System.out.printf("began to pick the wildflowers, and after a while, they %s so far\n", verb1 );
		System.out.printf("that they had wandered away from the trail.\n\n" );

		System.out.printf("It started to get dark. %s began to get worried, but %s seemed\n", male, female );
		System.out.printf("excited to have an adventure. \"Look!\" %s said. \"Do you see that\n", female);
		System.out.printf("%s? It looks like a house!\"\n\n", noun1 );

		System.out.printf("\"We're saved!\" cried %s, who was relieved.\n\n", male );

		System.out.printf("Once they got closer, %s felt very uneasy again. It didn't look like\n", male );
		System.out.printf("the cozy little cottage %s had been imagining, but rather a big, spooky\n", male );
		System.out.printf("tower! It was about %s feet tall, and it was covered with %s ivy\n", number, color );
		System.out.printf("and moss. It was the creepiest thing %s had ever seen!\n\n", male );

		System.out.printf("%s said, \"%s, let's keep walking! There's no way I'm going into\n", male, female );
		System.out.printf("that tower! It looks haunted!\"\n\n" );

		System.out.printf("\"Don't be such a(n) %s! We're going in. I think it looks %s\n", noun2, adverb1 );
		System.out.printf("un-haunted!\" said %s.\n\n", female );

		System.out.printf("%s was so scared that he could not open his eyes. He felt his %s\n", male, bodypart );
		System.out.printf("chatter as %s opened the door. All of a sudden, %s felt that he was\n", female, male );
		System.out.printf("not alone. He opened his eyes, prepared to see the worst. But instead, he\n" );
		System.out.printf("saw all his friends and family inside the haunted tower! \"Surprise! Happy\n" );
		System.out.printf("birthday, %s!\" they all %s.\n", male, verb2 );

	}
}

