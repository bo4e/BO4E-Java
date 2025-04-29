package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Marktrolle;
import bo4e.enums.Verwendungszweck;

import java.util.List;

/**
* Dient zur Identifizierung des Verwendungszwecks der Marktrolle an der Marktlokation, der
* die Werte zu übermitteln sind.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Verwendungszweck.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Verwendungszweck JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.7.0/src/bo4e_schemas/com/Verwendungszweck.json>`_
*/
public class VerwendungszweckProMarktrolle extends COM {
    private final ComTyp _typ = ComTyp.VERWENDUNGSZWECKPROMARKTROLLE;
    private Marktrolle marktrolle;
    private List<Verwendungszweck> zwecke;

    public VerwendungszweckProMarktrolle() {
    }

    private VerwendungszweckProMarktrolle(VerwendungszweckProMarktrolleBuilder builder) {
        super(builder);
        this.marktrolle = builder.marktrolle;
        this.zwecke = builder.zwecke;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Marktrolle, für die die Daten relevant sind
    */
    public Marktrolle getMarktrolle() {
        return marktrolle;
    }

    /**
    * Marktrolle, für die die Daten relevant sind
    */
    public void setMarktrolle(Marktrolle marktrolle) {
        this.marktrolle = marktrolle;
    }

    /**
    * Verwendungszwecke
    */
    public List<Verwendungszweck> getZwecke() {
        return zwecke;
    }

    /**
    * Verwendungszwecke
    */
    public void setZwecke(List<Verwendungszweck> zwecke) {
        this.zwecke = zwecke;
    }

    public static VerwendungszweckProMarktrolleBuilder builder() {
        return new VerwendungszweckProMarktrolleBuilder();
    }

    public static class VerwendungszweckProMarktrolleBuilder extends COMBuilder {
        private Marktrolle marktrolle;
        private List<Verwendungszweck> zwecke;

        private VerwendungszweckProMarktrolleBuilder() {
        }

        /**
        * Marktrolle, für die die Daten relevant sind
        */
        public VerwendungszweckProMarktrolleBuilder setMarktrolle(Marktrolle marktrolle) {
            this.marktrolle = marktrolle;
            return this;
        }

        /**
        * Verwendungszwecke
        */
        public VerwendungszweckProMarktrolleBuilder setZwecke(List<Verwendungszweck> zwecke) {
            this.zwecke = zwecke;
            return this;
        }

        public VerwendungszweckProMarktrolleBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public VerwendungszweckProMarktrolleBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public VerwendungszweckProMarktrolle build() {
            return new VerwendungszweckProMarktrolle(this);
        }
    }
}