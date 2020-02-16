/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BufferQ2;

import java.nio.IntBuffer;

/**
 *
 * @author Momen
 */
public class ExplainBuffer {
        public static void main(String[] args) {
        IntBuffer N4200200200 = IntBuffer.allocate(10);
        N4200200200.put(4);
        N4200200200.put(2);
        N4200200200.put(4, 2);
        N4200200200.put(7, 2);
        N4200200200.rewind();
        
        
        for (int Q : N4200200200.array()) {
            System.out.print(Q);
        }
    }
    
}
