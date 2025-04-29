package bo4e.bo;

import com.fasterxml.jackson.annotation.JsonInclude;
import bo4e.enums.BoTyp;
import bo4e.ZusatzAttribut;

import java.util.List;

/**
 * Das BO Geschäftsobjekt ist der Master für alle Geschäftsobjekte.
 * Alle Attribute, die hier in diesem BO enthalten sind, werden an alle BOs vererbt.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Geschaeftsobjekt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Geschaeftsobjekt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.1-/src/bo4e_schemas/bo/Geschaeftsobjekt.json>`_
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class Geschaeftsobjekt {
    private String _id;
    private final BoTyp _typ = BoTyp.GESCHAEFTSOBJEKT;
    private final String _version = "202401.7.0";
    private List<ZusatzAttribut> zusatzAttribute;

    protected Geschaeftsobjekt(GeschaeftsobjektBuilder builder) {
        this._id = builder._id;
        this.zusatzAttribute = builder.zusatzAttribute;
    }

    protected Geschaeftsobjekt() {
    }

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String get_id() {
        return _id;
    }

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public void set_id(String value) {
        this._id = value;
    }

    /**
     * Typ des Geschaeftsobjekts
     */
    public BoTyp get_typ() {
        return _typ;
    }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String get_version() {
        return _version;
    }

    public List<ZusatzAttribut> getZusatzAttribute() {
        return zusatzAttribute;
    }

    public void setZusatzAttribute(List<ZusatzAttribut> value) {
        this.zusatzAttribute = value;
    }

    public abstract static class GeschaeftsobjektBuilder {
        private String _id;
        private List<ZusatzAttribut> zusatzAttribute;

        /**
         * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
         */
        public GeschaeftsobjektBuilder set_id(String value) {
            this._id = value;
            return this;
        }

        public GeschaeftsobjektBuilder setZusatzAttribute(List<ZusatzAttribut> value) {
            this.zusatzAttribute = value;
            return this;
        }

        public abstract Geschaeftsobjekt build();
    }
}
