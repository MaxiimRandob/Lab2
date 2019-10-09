package service;

import com.Word;
import com.service.TextHandlerService;
import com.service.impl.TextHandlerServiceImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TextHandlerServiceTest
{
	TextHandlerService service = new TextHandlerServiceImpl();

	@Test
	public void shouldReturnCorrectlySortedListOfWords()
	{
		List<Word> sampleList = new ArrayList<>();

		Word al = new Word("al");
		Word all = new Word("all");
		Word alll = new Word("alll");

		sampleList.add(all.setWord());
		sampleList.add(alll.setWord());
		sampleList.add(al.setWord());

		service.sortTextByVowelsPercentageInWords(sampleList, System.out::println);

	}
}
