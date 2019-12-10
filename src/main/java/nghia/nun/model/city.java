package nghia.nun.model;


import javax.persistence.*;

@Entity
@Table(name = "citys")
public class city {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long city_id;
    private String city_name;
    private String quocgia;
    private long dientich;
    private long danso;
    private long gdp;
    private String mota;

    public city() {
    }

    public city(String city_name, String quocgia, long dientich, long danso, long gdp, String mota) {
        this.city_name = city_name;
        this.quocgia = quocgia;
        this.dientich = dientich;
        this.danso = danso;
        this.gdp = gdp;
        this.mota = mota;
    }

    public Long getCity_id() {
        return city_id;
    }

    public void setCity_id(Long city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public long getDientich() {
        return dientich;
    }

    public void setDientich(long dientich) {
        this.dientich = dientich;
    }

    public long getDanso() {
        return danso;
    }

    public void setDanso(long danso) {
        this.danso = danso;
    }

    public long getGdp() {
        return gdp;
    }

    public void setGdp(long gdp) {
        this.gdp = gdp;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
