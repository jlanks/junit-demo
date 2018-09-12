package core;

import junit.framework.TestCase;

public class ArithmeticSolverTest extends TestCase {
	
	public void testAdd() {
		
		ArithmeticSolver solver = new ArithmeticSolver(); 
		assertEquals(4,solver.add(2,2)); 
	}
	
	
	public void testSubtract() {
		
		ArithmeticSolver solver = new ArithmeticSolver(); 
		assertEquals(2,solver.subtract(4,2)); 
	}
	
public void testMultiply() {
		
		ArithmeticSolver solver = new ArithmeticSolver(); 
		assertEquals(8,solver.multiply(4,2)); 
	}

public void testDivide() {
	
	ArithmeticSolver solver = new ArithmeticSolver(); 
	assertEquals(4,solver.divide(8,2)); 
}

public void testSModulus() {
	
	ArithmeticSolver solver = new ArithmeticSolver(); 
	assertEquals(1,solver.modulus(5,2)); 
}
}
