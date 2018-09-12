package core;

import junit.framework.TestCase;

public class ArithmeticSolverTest extends TestCase {
	
	public void testAdd() {
		
		ArithmeticSolver solver = new ArithmeticSolver(); 
		assertEquals(4.0,solver.add(2,2)); 
	}
	
	
	public void testSubtract() {
		
		ArithmeticSolver solver = new ArithmeticSolver(); 
		assertEquals(2.0,solver.subtract(4,2)); 
	}
	
public void testMultiply() {
		
		ArithmeticSolver solver = new ArithmeticSolver(); 
		assertEquals(8.0,solver.multiply(4,2)); 
	}

public void testDivide() {
	
	ArithmeticSolver solver = new ArithmeticSolver(); 
	assertEquals(4.0,solver.divide(8,2)); 
}

public void testSModulus() {
	
	ArithmeticSolver solver = new ArithmeticSolver(); 
	assertEquals(1.0,solver.modulus(5,2)); 
}
}
