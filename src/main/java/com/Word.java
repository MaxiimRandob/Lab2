package com;

import java.util.stream.IntStream;

public class Word
{
	private final String word;

	private int wordLength;

	private int numberOfVowels;

	private int percentOfVowels;

	public Word(final String word)
	{
		this.word = word.toLowerCase();
	}

	private void countVowels()
	{
		long counter = IntStream
			.range(0, wordLength)
			.mapToObj(index -> Character.toString(word.charAt(index)))
			.filter(s -> s.matches("[aeiouy]"))
			.count();

		/*for (int i = 0; i < wordLength; i++)
		{
			if (Character.toString(word.charAt(i)).matches("[aeiouy]"))
			{
				++counter;
			}
		}*/

		this.numberOfVowels = (int)counter;
	}

	public Word setWord()
	{
		this.setWordLength();
		this.countVowels();
		this.countPercentOfVowels();
		return this;
	}

	private void setWordLength()
	{
		this.wordLength = word.length();
	}

	private void countPercentOfVowels()
	{
		this.percentOfVowels = (int)(((double)this.numberOfVowels / (double)this.wordLength) * 100);
	}

	public int getPercentOfVowels()
	{
		return this.percentOfVowels;
	}

	public String getWord()
	{
		return this.word;
	}
}
