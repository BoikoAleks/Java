package org.example;

import org.example.Main;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class test {
    @Test(dataProvider = "intProvider")
    public void intTest(int p, int p1){
            assertEquals(new Main().intTask(p), p1);
    }
    @DataProvider
    public Object[][] intProvider(){
        return(new Object[][]{{12, 0}, {2000, 2}});
    }

    @Test(dataProvider = "boolProvider")
    public void boolTest(int p, boolean p1){
        assertEquals(new Main().boolTask(p), p1);
    }
    @DataProvider
    public Object[][] boolProvider(){
        return(new Object[][]{{12, true}, {5, false}});
    }

    @Test(dataProvider = "ifProvider")
    public void ifTest(int p, int p1){
        assertEquals(new Main().ifTask(p), p1);
    }
    @DataProvider
    public Object[][] ifProvider(){
        return(new Object[][]{{12, 13}, {-1, -3}});
    }

    @Test(dataProvider = "caseProvider")
    public void caseTest(int p, String p1){
        assertEquals(new Main().caseTask(p), p1);
    }
    @DataProvider
    public Object[][] caseProvider(){
        return(new Object[][]{{12, "Помилка"}, {5, "Відмінно"}});
    }

    @Test(dataProvider = "whileProvider")
    public void whileTest(int a, int b, int p1){
        assertEquals(new Main().whileTask(a, b), p1);
    }
    @DataProvider
    public Object[][] whileProvider(){
        return(new Object[][]{{12, 2, 6}, {5, 2, 2}});
    }

    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int a, int p1[]){
        assertEquals(new Main().arrayTask(a), p1);
    }
    @DataProvider
    public Object[][] arrayProvider(){
        return(new Object[][]{{5, 1, 2, 4, 8, 16}, {3, 1, 2, 4}});
    }

    @Test(dataProvider = "matrixProvider")
    public void matrixTest(int a, int b, int p1[][]){
        assertEquals(new Main().matrixTask(a,b), p1);
    }
    @DataProvider
    public Object[][] matrixProvider(){
        int[][] input={{5, 10, 15}, {5, 10, 15}, {5, 10, 15}};
        int[][] input1={{5, 10}, {5, 10}};
        return(new Object[][]{{3, 3, input}, {2, 2, input1}});
    }

    @Test(dataProvider = "forProvider")
    public void forTest(int a, int b, int p1){
        assertEquals(new Main().forTask(a,b), p1);
    }
    @DataProvider
    public Object[][] forProvider(){
        return(new Object[][]{{3, 10, 8}, {5, 5, 1}});
    }
}
