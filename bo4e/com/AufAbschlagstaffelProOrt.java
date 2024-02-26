package bo4e.com;

/**
 * Gibt den Wert eines Auf- oder Abschlags und dessen Staffelgrenzen an
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/AufAbschlagstaffelProOrt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `AufAbschlagstaffelProOrt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.1.0-rc1/src/bo4e_schemas/com/AufAbschlagstaffelProOrt.json>`_
 */
public class AufAbschlagstaffelProOrt extends COM {
    private Double staffelgrenzeBis;
    private Double staffelgrenzeVon;
    private Double wert;

    public Double getStaffelgrenzeBis() { return staffelgrenzeBis; }
    public void setStaffelgrenzeBis(Double value) { this.staffelgrenzeBis = value; }

    public Double getStaffelgrenzeVon() { return staffelgrenzeVon; }
    public void setStaffelgrenzeVon(Double value) { this.staffelgrenzeVon = value; }

    public Double getWert() { return wert; }
    public void setWert(Double value) { this.wert = value; }

}
