package DZ6.Models;

import DZ6.Logics.ComplexNum;
import DZ6.Logics.ModelC;
public class SumModelC implements ModelC {

    public ComplexNum setComplexNum(double a, double b) {
        return new ComplexNum(a, b);
    }

    public ComplexNum result(ComplexNum a, ComplexNum b) {
        return new ComplexNum(a.getrPart() + b.getrPart(), a.getiPart() + b.getiPart());
    }
}
