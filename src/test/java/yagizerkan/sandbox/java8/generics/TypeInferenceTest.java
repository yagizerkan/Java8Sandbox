package yagizerkan.sandbox.java8.generics;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * @author Yagiz Erkan
 * @since 08/04/2014
 */
public class TypeInferenceTest {

  @Test
  public void emptyDictionarySizeShouldBeZero() {
    TypeInference testObj = new TypeInference();

    Map<String, String> dict = new HashMap<>();

    int expected = 0;
    int actual = testObj.getDictionarySize(dict);

    assertEquals("Size is incorrect!", expected, actual);
  }

  @Test
  public void emptyDictionarySizeShouldBeZero2() {
    TypeInference testObj = new TypeInference();

    int expected = 0;
    int actual = testObj.getDictionarySize(new HashMap<>());  //Java 7: Compile Error.
                                                              //Java 8: Better Type Inference

    assertEquals("Size is incorrect!", expected, actual);
  }
}
