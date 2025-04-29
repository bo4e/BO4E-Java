package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;

import java.util.List;

/**
* Dient der Adressierung über die Liegenschafts-Information.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Katasteradresse.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Katasteradresse JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.7.0/src/bo4e_schemas/com/Katasteradresse.json>`_
*/
public class Katasteradresse extends COM {
    private final ComTyp _typ = ComTyp.KATASTERADRESSE;
    private String flurstueck;
    private String gemarkungFlur;

    public Katasteradresse() {
    }

    private Katasteradresse(KatasteradresseBuilder builder) {
        super(builder);
        this.flurstueck = builder.flurstueck;
        this.gemarkungFlur = builder.gemarkungFlur;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    public String getFlurstueck() {
        return flurstueck;
    }

    public void setFlurstueck(String flurstueck) {
        this.flurstueck = flurstueck;
    }

    public String getGemarkungFlur() {
        return gemarkungFlur;
    }

    public void setGemarkungFlur(String gemarkungFlur) {
        this.gemarkungFlur = gemarkungFlur;
    }

    public static KatasteradresseBuilder builder() {
        return new KatasteradresseBuilder();
    }

    public static class KatasteradresseBuilder extends COMBuilder {
        private String flurstueck;
        private String gemarkungFlur;

        private KatasteradresseBuilder() {
        }

        public KatasteradresseBuilder setFlurstueck(String flurstueck) {
            this.flurstueck = flurstueck;
            return this;
        }

        public KatasteradresseBuilder setGemarkungFlur(String gemarkungFlur) {
            this.gemarkungFlur = gemarkungFlur;
            return this;
        }

        public KatasteradresseBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public KatasteradresseBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Katasteradresse build() {
            return new Katasteradresse(this);
        }
    }
}