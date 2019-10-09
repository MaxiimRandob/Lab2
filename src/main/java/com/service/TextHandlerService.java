package com.service;

import com.Word;

import java.util.List;
import java.util.function.Consumer;

public interface TextHandlerService
{

	void sortTextByVowelsPercentageInWords(
		List<Word> words,
		Consumer<String> consumer);
}
