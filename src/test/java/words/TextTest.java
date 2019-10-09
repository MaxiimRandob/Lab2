package words;

import com.Text;
import com.Word;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class TextTest
{
	private Text text;

	@Test
	public void shouldReturnCorrectlyFilledListOfWordsAfterSetting()
	{
		text = new Text("First, second, third");
		text.setWords();

		List<Word> resultList = text.getWords();
		assertEquals(resultList.get(0).getWord(), "first");
		assertEquals(resultList.get(1).getWord(), "second");
		assertEquals(resultList.get(2).getWord(), "third");
	}
}
