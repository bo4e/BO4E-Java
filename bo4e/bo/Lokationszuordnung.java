package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Zeitraum;
import bo4e.enums.BoTyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Modell für die Abbildung der Referenz auf die Lokationsbündelstruktur. Diese gibt an
* welche Marktlokationen,
* Messlokationen, Netzlokationen, technische/steuerbaren Ressourcen an einer Lokation
* vorhanden sind.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Lokationszuordnung.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Lokationszuordnung JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.7.0/src/bo4e_schemas/bo/Lokationszuordnung.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Lokationszuordnung extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.LOKATIONSZUORDNUNG;
    private Zeitraum gueltigkeit;
    private String lokationsbuendelcode;
    private List<Marktlokation> marktlokationen;
    private List<Messlokation> messlokationen;
    private List<Netzlokation> netzlokationen;
    private List<SteuerbareRessource> steuerbareRessourcen;
    private List<TechnischeRessource> technischeRessourcen;
    private String zuordnungstyp;

    public Lokationszuordnung() {
    }

    private Lokationszuordnung(LokationszuordnungBuilder builder) {
        super(builder);
        this.gueltigkeit = builder.gueltigkeit;
        this.lokationsbuendelcode = builder.lokationsbuendelcode;
        this.marktlokationen = builder.marktlokationen;
        this.messlokationen = builder.messlokationen;
        this.netzlokationen = builder.netzlokationen;
        this.steuerbareRessourcen = builder.steuerbareRessourcen;
        this.technischeRessourcen = builder.technischeRessourcen;
        this.zuordnungstyp = builder.zuordnungstyp;
    }

    public BoTyp get_typ() {
        return _typ;
    }

    /**
    * Zeitraum der Gültigkeit
    */
    public Zeitraum getGueltigkeit() {
        return gueltigkeit;
    }

    /**
    * Zeitraum der Gültigkeit
    */
    public void setGueltigkeit(Zeitraum gueltigkeit) {
        this.gueltigkeit = gueltigkeit;
    }

    /**
    * Code, der angibt wie die Lokationsbündelstruktur zusammengesetzt ist (zu finden unter
    * "Codeliste der Lokationsbündelstrukturen" auf https://www.edi-energy.de/index.php?id=38)
    */
    public String getLokationsbuendelcode() {
        return lokationsbuendelcode;
    }

    /**
    * Code, der angibt wie die Lokationsbündelstruktur zusammengesetzt ist (zu finden unter
    * "Codeliste der Lokationsbündelstrukturen" auf https://www.edi-energy.de/index.php?id=38)
    */
    public void setLokationsbuendelcode(String lokationsbuendelcode) {
        this.lokationsbuendelcode = lokationsbuendelcode;
    }

    /**
    * Liste mit referenzierten Marktlokationen
    */
    public List<Marktlokation> getMarktlokationen() {
        return marktlokationen;
    }

    /**
    * Liste mit referenzierten Marktlokationen
    */
    public void setMarktlokationen(List<Marktlokation> marktlokationen) {
        this.marktlokationen = marktlokationen;
    }

    /**
    * Liste mit referenzierten Messlokationen
    */
    public List<Messlokation> getMesslokationen() {
        return messlokationen;
    }

    /**
    * Liste mit referenzierten Messlokationen
    */
    public void setMesslokationen(List<Messlokation> messlokationen) {
        this.messlokationen = messlokationen;
    }

    /**
    * Liste mit referenzierten Netzlokationen
    */
    public List<Netzlokation> getNetzlokationen() {
        return netzlokationen;
    }

    /**
    * Liste mit referenzierten Netzlokationen
    */
    public void setNetzlokationen(List<Netzlokation> netzlokationen) {
        this.netzlokationen = netzlokationen;
    }

    /**
    * Liste mit referenzierten steuerbaren Ressourcen
    */
    public List<SteuerbareRessource> getSteuerbareRessourcen() {
        return steuerbareRessourcen;
    }

    /**
    * Liste mit referenzierten steuerbaren Ressourcen
    */
    public void setSteuerbareRessourcen(List<SteuerbareRessource> steuerbareRessourcen) {
        this.steuerbareRessourcen = steuerbareRessourcen;
    }

    /**
    * Liste mit referenzierten technischen Ressourcen
    */
    public List<TechnischeRessource> getTechnischeRessourcen() {
        return technischeRessourcen;
    }

    /**
    * Liste mit referenzierten technischen Ressourcen
    */
    public void setTechnischeRessourcen(List<TechnischeRessource> technischeRessourcen) {
        this.technischeRessourcen = technischeRessourcen;
    }

    /**
    * Verknüpfungsrichtung z.B. Malo-Melo [TODO: Eventuell anderer Datentyp]
    */
    public String getZuordnungstyp() {
        return zuordnungstyp;
    }

    /**
    * Verknüpfungsrichtung z.B. Malo-Melo [TODO: Eventuell anderer Datentyp]
    */
    public void setZuordnungstyp(String zuordnungstyp) {
        this.zuordnungstyp = zuordnungstyp;
    }

    public static LokationszuordnungBuilder builder() {
        return new LokationszuordnungBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class LokationszuordnungBuilder extends GeschaeftsobjektBuilder {
        private Zeitraum gueltigkeit;
        private String lokationsbuendelcode;
        private List<Marktlokation> marktlokationen;
        private List<Messlokation> messlokationen;
        private List<Netzlokation> netzlokationen;
        private List<SteuerbareRessource> steuerbareRessourcen;
        private List<TechnischeRessource> technischeRessourcen;
        private String zuordnungstyp;

        private LokationszuordnungBuilder() {
        }

        /**
        * Zeitraum der Gültigkeit
        */
        public LokationszuordnungBuilder setGueltigkeit(Zeitraum gueltigkeit) {
            this.gueltigkeit = gueltigkeit;
            return this;
        }

        /**
        * Code, der angibt wie die Lokationsbündelstruktur zusammengesetzt ist (zu finden unter
        * "Codeliste der Lokationsbündelstrukturen" auf https://www.edi-energy.de/index.php?id=38)
        */
        public LokationszuordnungBuilder setLokationsbuendelcode(String lokationsbuendelcode) {
            this.lokationsbuendelcode = lokationsbuendelcode;
            return this;
        }

        /**
        * Liste mit referenzierten Marktlokationen
        */
        public LokationszuordnungBuilder setMarktlokationen(List<Marktlokation> marktlokationen) {
            this.marktlokationen = marktlokationen;
            return this;
        }

        /**
        * Liste mit referenzierten Messlokationen
        */
        public LokationszuordnungBuilder setMesslokationen(List<Messlokation> messlokationen) {
            this.messlokationen = messlokationen;
            return this;
        }

        /**
        * Liste mit referenzierten Netzlokationen
        */
        public LokationszuordnungBuilder setNetzlokationen(List<Netzlokation> netzlokationen) {
            this.netzlokationen = netzlokationen;
            return this;
        }

        /**
        * Liste mit referenzierten steuerbaren Ressourcen
        */
        public LokationszuordnungBuilder setSteuerbareRessourcen(List<SteuerbareRessource> steuerbareRessourcen) {
            this.steuerbareRessourcen = steuerbareRessourcen;
            return this;
        }

        /**
        * Liste mit referenzierten technischen Ressourcen
        */
        public LokationszuordnungBuilder setTechnischeRessourcen(List<TechnischeRessource> technischeRessourcen) {
            this.technischeRessourcen = technischeRessourcen;
            return this;
        }

        /**
        * Verknüpfungsrichtung z.B. Malo-Melo [TODO: Eventuell anderer Datentyp]
        */
        public LokationszuordnungBuilder setZuordnungstyp(String zuordnungstyp) {
            this.zuordnungstyp = zuordnungstyp;
            return this;
        }

        public LokationszuordnungBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public LokationszuordnungBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Lokationszuordnung build() {
            return new Lokationszuordnung(this);
        }
    }
}