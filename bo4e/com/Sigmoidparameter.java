package bo4e.com;

/**
 * Die Sigmoid-Funktion, beispielsweise zur Berechnung eines Leistungspreises hat die Form:
 * LP=A/(1+(P/B)^C)+D
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Sigmoidparameter.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Sigmoidparameter JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.1.0-rc1/src/bo4e_schemas/com/Sigmoidparameter.json>`_
 */
public class Sigmoidparameter extends COM {
    private Double A;
    private Double B;
    private Double C;
    private Double D;

    public Double getA() { return A; }
    public void setA(Double value) { this.A = value; }

    public Double getB() { return B; }
    public void setB(Double value) { this.B = value; }

    public Double getC() { return C; }
    public void setC(Double value) { this.C = value; }

    public Double getD() { return D; }
    public void setD(Double value) { this.D = value; }

}
