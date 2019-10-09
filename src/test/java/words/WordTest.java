package words;

import com.Word;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordTest
{
	private Word word;

	@Test
	public void shouldCorrectlySetMemberStringWord()
	{
		String input = "Noodle";
		word = new Word(input);

		assertEquals(word.getWord(), input.toLowerCase());
	}

	@Test
	public void shouldCorrectlySetAllMembers()
	{
		String input = "Noodle";
		word = new Word(input);

		word.setWord();

		double length = input.length();
		double vowelsNum = 3.0;
		final int percentOfVowels = (int)((vowelsNum/length)*100);

		assertEquals(word.getPercentOfVowels(), percentOfVowels);
	}
}
