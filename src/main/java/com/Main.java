package com;

import com.service.TextHandlerService;
import com.service.impl.TextHandlerServiceImpl;

public class Main
{
	public static void main(String[] args)
	{
		run();
	}

	private static void run()
	{
		String input = "Lorem ipsum-dolor sit amet," +
			"consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
			"Suspendisse interdum consectetur libero id faucibus nisl tincidunt eget. " +
			"Orci a scelerisque purus semper eget. " +
			"Semper risus in hendrerit gravida rutrum quisque. " +
			"Vitae sapien pellentesque habitant morbi.";

		TextHandlerService textHandlerService = new TextHandlerServiceImpl();

		Text inputText = new Text(input);

		inputText.setWords();

		textHandlerService.sortTextByVowelsPercentageInWords(inputText.getWords(), System.out::println);
	}
}
