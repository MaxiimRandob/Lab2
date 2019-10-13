package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Text
{
	private final String text;

	private List<Word> words;

	public Text(final String text)
	{
		this.text = text;
		this.words = new ArrayList<>();
	}

	public void setWords()
	{

		final String SPLIT_WORDS_REGEX = "[,.\\s!?;:-]";

		Arrays.stream(text.split(SPLIT_WORDS_REGEX))
			.filter(stringWord -> stringWord.length() > 0)
			.map(stringWord -> new Word(stringWord).setWord())
			.forEach(word -> words.add(word));



		/*for (String retval : text.split(SPLIT_WORDS_REGEX))
		{
			if (retval.length() == 0)
			{
				continue;
			}
			words.add(new Word(retval).setWord());
		}*/
	}

	public List<Word> getWords()
	{
		return words;
	}
}
