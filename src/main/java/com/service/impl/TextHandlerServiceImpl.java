package com.service.impl;

import com.Word;
import com.service.TextHandlerService;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TextHandlerServiceImpl
	implements TextHandlerService
{

	public void sortTextByVowelsPercentageInWords(
		final
		List<Word> words,
		Consumer<String> consumer)
	{
		words.stream()
			.distinct()
			.sorted(Comparator.comparing(Word::getPercentOfVowels))
			.forEach(w -> consumer.accept(String.format("%s - %d%c", w.getWord(), w.getPercentOfVowels(), '%')));
	}
}
