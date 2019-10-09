package com;

public class Word
{
	private final String word;

	private double wordLength;

	private double numberOfVowels;

	private int percentOfVowels;

	public Word(final String word)
	{
		this.word = word.toLowerCase();
	}

	private void countVowels()
	{
		int counter = 0;

		for (int i = 0; i < wordLength; i++)
		{
			if (Character.toString(word.charAt(i)).matches("[aeiouy]"))
			{
				++counter;
			}
		}
		this.numberOfVowels = counter;
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
		this.percentOfVowels = (int)((this.numberOfVowels / this.wordLength) * 100);
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
