package java.main.plays;
//import org.junit.*;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.*;
//import org.junit.Assert;
//import java.main.spring.test.MyCollection;
//import java.main.spring.test.MyDictionary;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.*;

public class MyCollectionTest {

//    @Mock
//    List<String> mockList2;
//
//    //initialize Mockito annotations
//    @Before
//    public void init() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Mock
//    MyCollection myCollection;
//
//    @Test
//    public void size() {
//        when(myCollection.size()).thenReturn(20);
//    }
//
//    //
//    @Test
//    public void whenNotUseMockAnnotation_thenCorrect(){
//
//        //creation of mocked ArrayList
//        List mockList = mock(ArrayList.class);
//
//        mockList.add("one");
//        mockList.add("two");
//        verify(mockList).add("one");
//
//        assertEquals(0,mockList.size());
//
//        when(mockList.size()).thenReturn(100);
//        assertEquals(100,mockList.size());
//
//    }
//
//    @Test
//    public void whenUserMockAnnotation_thanMockInjected(){
//        mockList2.add("one");
//        verify(mockList2).add("one");
//        assertEquals(0,mockList2.size());
//        when(mockList2.size()).thenReturn(100);
//        assertEquals(100,mockList2.size());
//    }
//
//    //Mock.spy
//    @Spy
//    List<String> spyList = new ArrayList<String>();
//    @Test
//    public void whenUserSpyAnnotation_thanSpyIsInjectedCorrectly(){
//
//        spyList.add("one");
//        spyList.add("two");
//
//        verify(spyList).add("one");
//        verify(spyList).add("two");
//
//        assertEquals(2,spyList.size());
//
//        //Mockito.doReturn(100).when(spyList.size());
//        when(spyList.size()).thenReturn(100);
//        assertEquals(100,spyList.size());
//    }
//
//    //InjectMocks - create mock object which will be injected to different mock with annotation @InjectMock
//
//    @Mock
//    Map<String,String> wordMap;
//
//    @InjectMocks
//    MyDictionary dic = new MyDictionary();
//
//    @Test
//    public void whenUserInjectMockAnnotation_thenCorrect(){
//        when(wordMap.get("aWord")).thenReturn("aMeaning");
//        assertEquals("aMeaning",dic.getMeaning("aWord"));
//    }
}