package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Speichert Informationen zu einer tagesparameter abhängigen Messstelle. z.B. den Namen
* einer Klimazone oder die ID
* der Wetterstation für die Temperaturmessstelle
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tagesparameter extends COM {
    private final ComTyp _typ = ComTyp.TAGESPARAMETER;
    private String dienstanbieter;
    private String herausgeber;
    private String klimazone;
    private String temperaturmessstelle;

    public Tagesparameter() {
    }

    private Tagesparameter(TagesparameterBuilder builder) {
        super(builder);
        this.dienstanbieter = builder.dienstanbieter;
        this.herausgeber = builder.herausgeber;
        this.klimazone = builder.klimazone;
        this.temperaturmessstelle = builder.temperaturmessstelle;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    public String getDienstanbieter() {
        return dienstanbieter;
    }

    public void setDienstanbieter(String dienstanbieter) {
        this.dienstanbieter = dienstanbieter;
    }

    public String getHerausgeber() {
        return herausgeber;
    }

    public void setHerausgeber(String herausgeber) {
        this.herausgeber = herausgeber;
    }

    public String getKlimazone() {
        return klimazone;
    }

    public void setKlimazone(String klimazone) {
        this.klimazone = klimazone;
    }

    public String getTemperaturmessstelle() {
        return temperaturmessstelle;
    }

    public void setTemperaturmessstelle(String temperaturmessstelle) {
        this.temperaturmessstelle = temperaturmessstelle;
    }

    public static TagesparameterBuilder builder() {
        return new TagesparameterBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class TagesparameterBuilder extends COMBuilder {
        private String dienstanbieter;
        private String herausgeber;
        private String klimazone;
        private String temperaturmessstelle;

        private TagesparameterBuilder() {
        }

        public TagesparameterBuilder setDienstanbieter(String dienstanbieter) {
            this.dienstanbieter = dienstanbieter;
            return this;
        }

        public TagesparameterBuilder setHerausgeber(String herausgeber) {
            this.herausgeber = herausgeber;
            return this;
        }

        public TagesparameterBuilder setKlimazone(String klimazone) {
            this.klimazone = klimazone;
            return this;
        }

        public TagesparameterBuilder setTemperaturmessstelle(String temperaturmessstelle) {
            this.temperaturmessstelle = temperaturmessstelle;
            return this;
        }

        public TagesparameterBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public TagesparameterBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Tagesparameter build() {
            return new Tagesparameter(this);
        }
    }
}