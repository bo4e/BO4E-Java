package bo4e.com;

/**
 * Gibt die Staffelgrenzen der jeweiligen Preise an
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/TarifpreisstaffelProOrt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `TarifpreisstaffelProOrt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.1.0-rc1/src/bo4e_schemas/com/TarifpreisstaffelProOrt.json>`_
 */
public class TarifpreisstaffelProOrt extends COM {
    private Double arbeitspreis;
    private Double arbeitspreisNT;
    private Double grundpreis;
    private Double staffelgrenzeBis;
    private Double staffelgrenzeVon;

    public Double getArbeitspreis() { return arbeitspreis; }
    public void setArbeitspreis(Double value) { this.arbeitspreis = value; }

    public Double getArbeitspreisNT() { return arbeitspreisNT; }
    public void setArbeitspreisNT(Double value) { this.arbeitspreisNT = value; }

    public Double getGrundpreis() { return grundpreis; }
    public void setGrundpreis(Double value) { this.grundpreis = value; }

    public Double getStaffelgrenzeBis() { return staffelgrenzeBis; }
    public void setStaffelgrenzeBis(Double value) { this.staffelgrenzeBis = value; }

    public Double getStaffelgrenzeVon() { return staffelgrenzeVon; }
    public void setStaffelgrenzeVon(Double value) { this.staffelgrenzeVon = value; }

}
