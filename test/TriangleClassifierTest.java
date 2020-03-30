import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
//  input 2,2,2 = tam giac deu
    void equiangularTriangle() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(2,2,2);
        String triangleCheck = triangleClassifier.equiangularTriangle();
        String expected="Tam giac deu";
        assertEquals(expected, triangleCheck);
    }

    @Test
//  input 2,2,3 = tam giac can
    void isoscelesTriangle() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(2,2,3);
        String triangleCheck = triangleClassifier.isoscelesTriangle();
        String expected = "Tam giac can";
        assertEquals(expected, triangleCheck);
    }

    @Test
//  input 3,4,5 = tam giac thuong
    void scaleneTriangle() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(3,4,5);
        String triangleCheck = triangleClassifier.scaleneTriangle();
        String expected = "Tam giac thuong";
        assertEquals(expected, triangleCheck);
    }

    @Test
//  input 8,2,3 = khong phai tam giac
    void scaleneTriangle2() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(8,2,3);
        String triangleCheck = triangleClassifier.scaleneTriangle();
        String expected = "Khong phai tam giac";
        assertEquals(expected, triangleCheck);
    }

    @Test
//  input -1,2,1 = khong phai tam giac
    void scaleneTriangle3() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(-1,2,1);
        String triangleCheck = triangleClassifier.scaleneTriangle();
        String expected = "Khong phai tam giac";
        assertEquals(expected, triangleCheck);
    }

    @Test
//  input 0,1,1 = khong phai tam giac
    void scaleneTriangle4() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(0,1,1);
        String triangleCheck = triangleClassifier.scaleneTriangle();
        String expected = "Khong phai tam giac";
        assertEquals(expected, triangleCheck);
    }
}