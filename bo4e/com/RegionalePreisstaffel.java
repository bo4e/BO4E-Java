package bo4e.com;

/**
 * Abbildung einer Preisstaffel mit regionaler Abgrenzung
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/RegionalePreisstaffel.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `RegionalePreisstaffel JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.1.0-rc1/src/bo4e_schemas/com/RegionalePreisstaffel.json>`_
 */
public class RegionalePreisstaffel extends COM {
    private Double einheitspreis;
    private RegionaleGueltigkeit regionaleGueltigkeit;
    private Sigmoidparameter sigmoidparameter;
    private Double staffelgrenzeBis;
    private Double staffelgrenzeVon;

    public Double getEinheitspreis() { return einheitspreis; }
    public void setEinheitspreis(Double value) { this.einheitspreis = value; }

    public RegionaleGueltigkeit getRegionaleGueltigkeit() { return regionaleGueltigkeit; }
    public void setRegionaleGueltigkeit(RegionaleGueltigkeit value) { this.regionaleGueltigkeit = value; }

    public Sigmoidparameter getSigmoidparameter() { return sigmoidparameter; }
    public void setSigmoidparameter(Sigmoidparameter value) { this.sigmoidparameter = value; }

    public Double getStaffelgrenzeBis() { return staffelgrenzeBis; }
    public void setStaffelgrenzeBis(Double value) { this.staffelgrenzeBis = value; }

    public Double getStaffelgrenzeVon() { return staffelgrenzeVon; }
    public void setStaffelgrenzeVon(Double value) { this.staffelgrenzeVon = value; }

}
