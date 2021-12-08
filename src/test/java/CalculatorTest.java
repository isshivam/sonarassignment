import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    public void add(){
        //given
        int val1=0;
        int val2=21;
        //when
        int sum=calc.add(val1,val2);
        //then
        assertEquals(21,sum);

    }
    @Test
    public void sub(){
        //given
        int val1=30;
        int val2=21;
        //when
        int sub =calc.sub(val1,val2);
        //then
        assertEquals(9, sub);

    }
    @Test
    public void mul(){
        //given
        int val1=3;
        int val2=20;
        //when
        int mul =calc.mul(val1,val2);
        //then
        assertEquals(60, mul);

    }
    @Test
    public void div(){
        //given
        int val1=30;
        int val2=10;
        //when
        double div =calc.div(val1,val2);
        //then
        assertEquals(3.0, div);

    }

}
