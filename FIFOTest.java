package test.azerty;

import azerty.FIFO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


/** 
* FIFO Tester. 
* 
* @author <Authors name> 
* @since <pre>f�vr. 28, 2019</pre> 
* @version 1.0 
*/ 
public class FIFOTest { 

@BeforeEach
public void before() throws Exception { 
} 

@AfterEach
public void after() throws Exception { 
} 

/** 
* 
* Method: add(Integer myInt) 
* 
*/ 
@Test
public void testAdd() throws Exception { 
//TODO: Test goes here...
    FIFO fifoTes = new FIFO();
    int fifoTaille = fifoTes.size();
    fifoTes.add(5);
    assertEquals(fifoTaille,fifoTaille++);

    FIFO fifoDeTes = new FIFO();
    fifoDeTes.add(8);
    assertEquals(fifoDeTes.first(),Integer.valueOf(8));
} 

/** 
* 
* Method: first() 
* 
*/ 
@Test
public void testFirst() throws Exception {
//TODO: Test goes here...
    FIFO fifoTes = new FIFO();
    assertThrows(NoSuchElementException.class, () -> fifoTes.first());

    fifoTes.add(84);
    assertEquals(fifoTes.first(), Integer.valueOf(84));
} 

/** 
* 
* Method: isEmpty() 
* 
*/ 
@Test
public void testIsEmpty() throws Exception { 
//TODO: Test goes here...
    FIFO fifoTes = new FIFO();
    assertEquals(fifoTes.isEmpty(), true);
} 

/** 
* 
* Method: removeFirst() 
* 
*/ 
@Test
public void testRemoveFirst() throws Exception { 
//TODO: Test goes here...
    FIFO fifoTes = new FIFO();
    assertThrows(NoSuchElementException.class, ()-> fifoTes.removeFirst());

    FIFO fifoDeTes = new FIFO();
    fifoDeTes.add(9);
    fifoDeTes.add(17);
    fifoDeTes.removeFirst();
    assertEquals(fifoDeTes.first(),Integer.valueOf(17));
} 

/** 
* 
* Method: size() 
* 
*/ 
@Test
public void testSize() throws Exception { 
//TODO: Test goes here...
    FIFO fifoTes = new FIFO();
    int tailleTes = 1;
    fifoTes.add(4);
    assertEquals(fifoTes.size(), tailleTes);

    FIFO fifoDeTes = new FIFO();
    int tailleDeTes = 0;
    assertEquals(fifoDeTes.size(), tailleDeTes);
} 


} 
