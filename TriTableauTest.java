package test.azerty; 


import azerty.TriTableau;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import  java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;


/** 
* TriTableau Tester. 
* 
* @author <Authors name> 
* @since <pre>f�vr. 28, 2019</pre> 
* @version 1.0 
*/ 
public class TriTableauTest { 

@BeforeEach
public void before() throws Exception { 
} 

@AfterEach
public void after() throws Exception { 
} 

/** 
* 
* Method: trier(int tab[]) 
* 
*/ 
@Test
public void testTrier() throws IOException {
//TODO: Test goes here...
    int[] triTableau = {3,2,1};

    try {
        TriTableau.trier(triTableau);

        for (int i = 0; i < triTableau.length - 1; i++) {
            assertTrue(triTableau[i] >= triTableau[i + 1]);
        }
    }catch (IOException e){
        System.out.println((e));
    }

} 

/** 
* 
* Method: triCroissant(int tableau[]) 
* 
*/ 
@Test
public void testTriCroissant() throws IOException {
//TODO: Test goes here...
    int[] triTableau = {3,2,1};
    int[] triTableauResult = {1,2,3};
    TriTableau.triCroissant(triTableau);
    assertEquals(triTableau[0],triTableauResult[0]);

    //testTriCroissant testSupp
    for (int i = 0; i < triTableau.length - 1; i++) {
        assertTrue(triTableau[i] <= triTableau [i+1]);
    }
} 

/** 
* 
* Method: triDecroissant(int tableau[]) 
* 
*/ 
@Test
public void testTriDecroissant() throws IOException {
//TODO: Test goes here...
    int[] triTableau = {1,2,3};
    int[] triTableauResult = {3,2,1};
    TriTableau.triDecroissant(triTableau);
    assertEquals(triTableau[0],triTableauResult[0]);

    //testTriDecroissant testSupp
    for (int i = 0; i < triTableau.length - 1; i++) {
        if( i != triTableau.length) {
            assertTrue(triTableau[i] >= triTableau[i + 1]);
        }
    }
} 


} 
